package com.microsoft.azure.cassandra.coupon.controller;


import com.datastax.driver.core.utils.UUIDs;
import com.microsoft.azure.cassandra.coupon.model.Coupon;
import com.microsoft.azure.cassandra.coupon.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping(path="/coupons", produces = MediaType.APPLICATION_JSON_VALUE)
public class CouponController {
    @Autowired
    private CouponRepository couponRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody
    ResponseEntity<Coupon> createCoupon(@RequestBody final Coupon coupon) {
        if(coupon.getId() == null || coupon.getId().isEmpty()) {
            coupon.setId(UUIDs.timeBased().toString());
        }
        Coupon savedCoupon = couponRepository.updateCoupon(coupon.getId(), coupon.getName(), coupon.getUser());
        return new ResponseEntity<>(savedCoupon, HttpStatus.OK);

    }

    @GetMapping
    public @ResponseBody
    Iterable<Coupon> getAllCoupons() {
        return couponRepository.findAll();
    }

    @GetMapping("/{id}/{name}")
    public @ResponseBody
    Optional<Coupon> getCoupon(@PathVariable String id, @PathVariable String name) {
        return couponRepository.findByIdAndName(id, name);
    }


    @DeleteMapping("/{id}/{name}")
    public @ResponseBody
    Optional<Coupon> deleteCoupon(@PathVariable String id,@PathVariable String name) {
        return couponRepository.deleteByIdAndName(id, name);
    }
}