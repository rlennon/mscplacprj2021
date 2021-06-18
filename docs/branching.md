| [Back to README.MD](../README.md)
| ---------------------------------------------------- |

# Branching Strategy
Our team agreed to follow Git Flow branching startegy after discussing other option as it is a widely used workflow strategy by organizations that have a scheduled release cycle. This document contains the working details of the workflow.

## The Main Branches
The following are the main braches for the central repository of the project.
    * main: the default branch with infinite life time containing all finished work and all deployments will be taking place from here.
    * develop: a branch with infinite life time parellel to the main branch and developers create branches from the develop branch and work on new features. 
### Supporting Branches
We use supporting branhes with finite life time, apart from the above discussed, for a wide range of reasons such as parellel development, quick fixing bugs, develop new features, production releases. These may include:
    * feature branches
    * release branches
    * hotfix branches

#### Feature Branches
    All feature branches may branch off from develop and must be merged back into develop. Naming convention must be: anything except main, develop, release-*, or hotfix-*.

##### To Create a Feature Branch
    $ git checkout -b newfeature develop

##### To Merge Finished Feature into develop
    $ git checkout develop
    
    $ git merge --no-ff newfeature
    
    $ git branch -d newfeature
    
    $ git push origin develop

#### Hotfixes 
    In a situation where a bug with catastrophic consequences has been discovered in production, the team uses a hotfix bracnh for the purpose of fixing the bug in question. It may branch off from the main and must merge back into the main and develop.

    * naming convention: hotfix-*

#### Releases
    The team can use release branches to support preparation of a new production release. It may branch off from the develop and must merge back into the main and develop. 

    * naming convention: release-*




