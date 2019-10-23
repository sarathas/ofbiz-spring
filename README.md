# ofbiz-spring

This repository enables Spring apps as OFBiz plugins. It contains two sample resources and manages a dispatcher and a delegator as spring managed beans.
No additional configuration, extend to your liking.

This plugin needs at least Gradle 4.10! 

## Download OFBiz

See https://ofbiz.apache.org/download.html

## Update Gradle version to 4.10 or higher

* Go to gradle folder
* Change RELEASE, GRADLE_WRAPPER_URI, SHASUM_GRADLE_WRAPPER_FILES in init-gradle-wrapper.sh
* Change version number in init-gradle-wrapper.ps1
* Go to gradle/wrapper
* Change distributionUrl

## How to use

* Download the repository into your OFBiz plugins folder.
* Restart OFBiz.
* Navigate to https://path/to/ofbiz/spring/api/ --> See welcome message
* Navigate to https://path/to/ofbiz/spring/api/party --> See all parties as an ugly string

## Further improvement

We need a way to map screens, so feel free to submit PRs ;)
