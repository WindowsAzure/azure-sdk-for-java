[![Build Status](https://travis-ci.org/Azure/azure-libraries-for-java.svg?style=flat-square&label=build)](https://travis-ci.org/Azure/azure-libraries-for-java)

> :triangular_flag_on_post: *NOTE: The **Azure Libraries for Java** project (resource management APIs with fluent interface design pattern) has moved to http://github.com/azure/azure-libraries-for-java, so please log issues for that project in that new repository. This repository is now dedicated to all the other, auto-generated, non-management Azure SDKs only.*

# Azure SDKs for Java

:+1: [Try Azure for FREE](http://go.microsoft.com/fwlink/?LinkId=330212)

This repository contains Azure SDKs enabling the programmatic *consumption* of miscellaneous Azure services (i.e. *not management* - for that see http://github.com/azure/azure-libraries-for-java)

Currently, this repository contains the following Azure SDKs:

* [Cognitive Services](#cognitive-services)
  * [Entity Search](#entity-search)
  * [Language](#language)
  * [Vision](#vision)

* [Media Services](#media-services)

## Other Azure SDKs

These other Azure SDKs for Java, that are not currently in this repository, can be found as follows:

* [Azure Batch SDK for Java](https://github.com/azure/azure-batch-sdk-for-java)
* [Azure Data Lake Store Client for Java](https://github.com/Azure/azure-data-lake-store-java)
* [Azure DocumentDB SDK for Java](https://github.com/Azure/azure-documentdb-java)
* [Azure Key Vault SDK for Java](https://github.com/Azure/azure-keyvault-java)
* [Azure Management Libraries for Java](https://github.com/azure/azure-libraries-for-java)
* [Azure Service Bus SDK for Java](https://github.com/Azure/azure-service-bus-java)
* [Azure Storage SDK for Java](https://github.com/Azure/azure-storage-java)
* [Microsoft JDBC Driver for SQL Server](https://github.com/Microsoft/mssql-jdbc)

## General Information
* [Prerequisites](#prerequisites)
* [Help and issues](#help-and-issues)
* [Contribute code](#contribute-code)


## Cognitive Services

The following projects provide Java APIs for [Azure Cognitive Services](https://azure.microsoft.com/en-us/services/cognitive-services/):

<table><tr><th>Project</th><th>Status</th><th>Download</th><th>Issue Label</th></tr>
<tr>
	<td><a name="entity-search" href="https://github.com/Azure/azure-sdk-for-java/tree/master/cognitiveservices/azure-entitysearch">Entity Search</a></td>
	<td>Under construction</td>
	<td>TBD</td>
	<td><a href="https://github.com/azure/azure-sdk-for-java/issues?q=is%3Aopen+is%3Aissue+label%3AEntitySearch">EntitySearch</a></td>
</tr>

<tr>
	<td><a name="language" href="https://github.com/Azure/azure-sdk-for-java/tree/master/cognitiveservices/azure-language">Language</a></td>
	<td>Under construction</td>
	<td>TBD</td>
	<td><a href="https://github.com/azure/azure-sdk-for-java/issues?utf8=%E2%9C%93&q=is%3Aopen%20is%3Aissue%20label%3ALanguage">Language</a></td>
</tr>

<tr>
	<td><a name="vision" href="https://github.com/Azure/azure-sdk-for-java/tree/master/cognitiveservices/azure-vision">Vision</a></td>
	<td>Under construction</td>
	<td>TBD</td>
	<td><a href="https://github.com/azure/azure-sdk-for-java/issues?utf8=%E2%9C%93&q=is%3Aopen%20is%3Aissue%20label%3AVision">Vision</a></td>
</tr>
</table>

## Media Services

* **Download**: Maven artifact ID: [**azure-media**](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22com.microsoft.azure%22%20AND%20a%3A%22azure-media%22)

* [**Sources**](https://github.com/Azure/azure-sdk-for-java/tree/0.9/services/azure-media).

* **Issues**: When logging [issues related to the Media SDK](https://github.com/azure/azure-sdk-for-java/issues?q=is%3Aopen+is%3Aissue+label%3AMediaServices), please use the **MediaServices** label.

* [**Learn more...**](https://azure.microsoft.com/en-us/services/media-services/)

## Prerequisites

- A Java Developer Kit (JDK), v 1.7 or later
- Maven

## Help and Issues

If you encounter any bugs with these SDKs, please file issues via [Issues](https://github.com/Azure/azure-sdk-for-java/issues) or checkout [StackOverflow for Azure Java SDK](http://stackoverflow.com/questions/tagged/azure-java-sdk).

## Contribute Code

If you would like to become an active contributor to this project please follow the instructions provided in [Microsoft Azure Projects Contribution Guidelines](http://azure.github.io/guidelines.html).

1. Fork it
2. Create your feature branch (`git checkout -b my-new-feature`)
3. Commit your changes (`git commit -am 'Add some feature'`)
4. Push to the branch (`git push origin my-new-feature`)
5. Create new Pull Request

---

This project has adopted the [Microsoft Open Source Code of Conduct](https://opensource.microsoft.com/codeofconduct/). For more information see the [Code of Conduct FAQ](https://opensource.microsoft.com/codeofconduct/faq/) or contact [opencode@microsoft.com](mailto:opencode@microsoft.com) with any additional questions or comments.
