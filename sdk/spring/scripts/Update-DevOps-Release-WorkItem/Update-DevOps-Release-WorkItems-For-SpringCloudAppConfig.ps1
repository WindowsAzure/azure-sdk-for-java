#Requires -Version 6.0

$releaseDate = "05/25/2021"
$appconfiguration = "spring"
$springtCloudAppConfigReleaseVersion = "1.4.0"

. ${PSScriptRoot}\Update-DevOps-Release-WorkItem-Util.ps1 $releaseDate $serviceDirectory $springtCloudAppConfigReleaseVersion spring-cloud-azure-appconfiguration-config
. ${PSScriptRoot}\Update-DevOps-Release-WorkItem-Util.ps1 $releaseDate $serviceDirectory $springtCloudAppConfigReleaseVersion spring-cloud-azure-appconfiguration-config-web
. ${PSScriptRoot}\Update-DevOps-Release-WorkItem-Util.ps1 $releaseDate $serviceDirectory $springtCloudAppConfigReleaseVersion spring-cloud-azure-feature-management
. ${PSScriptRoot}\Update-DevOps-Release-WorkItem-Util.ps1 $releaseDate $serviceDirectory $springtCloudAppConfigReleaseVersion spring-cloud-azure-feature-management-web
. ${PSScriptRoot}\Update-DevOps-Release-WorkItem-Util.ps1 $releaseDate $serviceDirectory $springtCloudAppConfigReleaseVersion spring-cloud-starter-azure-appconfiguration-config
