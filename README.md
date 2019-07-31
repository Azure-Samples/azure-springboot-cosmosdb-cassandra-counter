---
page_type: sample
languages:
- java
products:
- Azure Cosmos Cassandra 
description: "Java Spring boot reference sample to show usage of CosmosDB Cassandra counters using spring-boot-starter-data-cassandra"
---


# Official Microsoft Sample

<!-- 
Guidelines on README format: https://review.docs.microsoft.com/help/onboard/admin/samples/concepts/readme-template?branch=master

Guidance on onboarding samples to docs.microsoft.com/samples: https://review.docs.microsoft.com/help/onboard/admin/samples/process/onboarding?branch=master

Taxonomies for products and languages: https://review.docs.microsoft.com/new-hope/information-architecture/metadata/taxonomies?branch=master
-->

Give a short description for your sample here. What does it do and why is it important?

## Contents

Outline the file contents of the repository. It helps users navigate the codebase, build configuration and any related assets.

| File/folder       | Description                                |
|-------------------|--------------------------------------------|
| `src`             | Sample source code.                        |
| `.gitignore`      | Define what to ignore at commit time.      |
| `CHANGELOG.md`    | List of changes to the sample.             |
| `CONTRIBUTING.md` | Guidelines for contributing to the sample. |
| `README.md`       | This README file.                          |
| `LICENSE`         | The license for the sample.                |

## Prerequisites

Outline the required components and tools that a user might need to have on their machine in order to run the sample. This can be anything from frameworks, SDKs, OS versions or IDE releases.

## Setup

## Steps to run the App
git clone https://github.com/Azure-Samples/azure-springboot-cosmosdb-cassandra-counter.git </br>  
cd azure-springboot-cosmosdb-cassandra-counter </br>  
mvn clean install  </br>  
mvn clean spring-boot:run  </br>  


## Running the sample

## Steps to test
### GET all records </br>  
curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://localhost:8080/coupons </br>  

## POST new record  </br>  
curl -X POST -H "Content-Type: application/json" -d '{"name" : "microsoft3","user" : "jr3"}' http://localhost:8080/coupons </br>  
## POST counter record  </br>  
curl -X POST -H "Content-Type: application/json" -d '{"id": "ec514720-ae7f-11e9-9caf-1bd76ed297da","name" : "microsoft3","user" : "jr3"}' http://localhost:8080/coupons </br>  

## Key concepts

Provide users with more context on the tools and services used in the sample. Explain some of the code that is being used and how services interact with each other.

### Cassandra Counters 
A counter is a special column used to store an integer that is changed in increments.
Counters are useful for many data models. Some examples:

1) To keep track of the number of web page views received on a company website
2) To keep track of the number of games played online or the number of players who have joined an online game


## Contributing

This project welcomes contributions and suggestions.  Most contributions require you to agree to a
Contributor License Agreement (CLA) declaring that you have the right to, and actually do, grant us
the rights to use your contribution. For details, visit https://cla.opensource.microsoft.com.

When you submit a pull request, a CLA bot will automatically determine whether you need to provide
a CLA and decorate the PR appropriately (e.g., status check, comment). Simply follow the instructions
provided by the bot. You will only need to do this once across all repos using our CLA.

This project has adopted the [Microsoft Open Source Code of Conduct](https://opensource.microsoft.com/codeofconduct/).
For more information see the [Code of Conduct FAQ](https://opensource.microsoft.com/codeofconduct/faq/) or
contact [opencode@microsoft.com](mailto:opencode@microsoft.com) with any additional questions or comments.
