package com.microsoft.azure.cassandra.coupon.repository;

import com.microsoft.azure.cassandra.coupon.model.Coupon;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CouponRepository extends CassandraRepository<Coupon, String> {

    @Query("update couponprofile.coupon SET usage = usage + 1 WHERE id = ?0 AND name = ?1 AND user = ?2")
    Coupon updateCoupon(String id, String name, String user);

    @Query("select * from couponprofile.coupon where id = ?0 and name = ?1")
    Optional<Coupon> findByIdAndName(final String id, final String name);

    @Query("delete from couponprofile.coupon where id = ?0 and name = ?1")
    Optional<Coupon> deleteByIdAndName(final String id, final String name);


}