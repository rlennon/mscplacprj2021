| [Back to README.MD](../README.md)
| ---------------------------------------------------- |

# Container Security

In order to secure the software supply chain from possible attacks, the container requires security protection. 
Anchore Open Source tool GitHub actions integration will add continuous compliance to the devlopment tool chain.
This action invokes the grype scanner and returning the vulnerabilities found, and optionally fail if found a vulnerability with a configurable severity level.

As per the providers documents, When using in the workflow this action quickly verify files or containers' content after a build and before pushing, allowing PRs, or deploying updates.

## Benefits

* Runs locally, without sending data outbound - no credentials required!
* Speedy scan operations
* Scans both paths and container images
* Easy failure evaluation depending on vulnerability severity

## More Information
[Visit](https://github.com/marketplace/actions/anchore-container-scan)
