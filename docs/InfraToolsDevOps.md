# Proposed Infrastructure Tools/Resources for DevOps

1. AWS CloudFormation
    * designed for users working in the AWS Cloud
    * allows users to model infrastructure within JSON or YAML template file
    * automation features to help with deployment of resources in a repeatable and manageable way.
    * Use of AWS CloudFormation Registry to model and provision third-party resources and modules
      published by AWS Partner Networks (APN).
    * can build own resource providers using AWS CloudFormation CLI.
    * use AWS Serverless Application Model (SAM) to build serverless applications faster.
    * CloudFormation automates provisioning and updating of infrastructure in a safe and controlled manner.
    * Dependency management.
    * AWS CDK (open-source software development framework) can be used to model cloud application resources using
      familiar programming languages (Java, Python, TypeScript,.NET to mention a few).

2. Azure Resource Manager (ARM)
    * provision infrastructure and handle dependencies in one seamless cycle through Azure Resource Manager templates
      (ARM templates).
    * resources template tap into are declaratively described within JSON & multtiple Azure resources can be declared
      in one ARM template to establish whole project environments.
    * same template can be reused an infinite amount of times.
    * use of Visual Studio Team System (VSTS) dashboard to visually monitor all builds and releases, and get a
      quick overview of the overall health of environments and quality of the templates.
    * supports grouping of server instances and the unified management of groups.

3. Google Cloud Deployment Manager
    * bases execution on config files (YAML) and templates (JINJA2 or PYTHON), all within the Google Cloud Platform.
    * allows the definition and deployment of resources synchronistically.
    * all deployments can be fully scripted with autoscaling & load balancing capabilities.
    * can sneak an advanced overview of the impact deployments and changes will have. This feature allows for human
      errors to be avoided and to strengthn & stabilize the infrastructure as a whole.

4. Terraform
    * unlike the previous three which are designed to work with specific cloud environments, this is completely cloud-
      agnostic and helps in tackling large infrastructure for complex distributed applications.
    * it is also idempotent, meaning the same template can be reused an infinite amount of times.
    * automation comes in various shapes and is orchestrated in varying degrees with the focus on the core plan/apply
      cycle. Can be run locally using wrapper scripts or run entirely within an alternat orchestration tool such as
      "Jenkins".
    * by far the most adaptable tool in the market according to the literature.
    * also supports change and provisioning previews & has capable features for replicating deployments and
      individual server instances.

5. Chef
    * particularly popular as a IaC tool among CI/CD practitioners.
    * uses Ruby-based DSL (Domain Scripting Language)
    * support for cloud provisioning APIs, as such, works well with other IaC tools including Terraform as well as
      multiple other cloud environments.

6. Ansible
    *generally well received and appreciated, moreso by those in a Red Hat environment.
    * designed with automation in mind from the start.
    * focuses on providing "radically simple" configuration language as well as being able to manage cloud instances
      immediately with no modifications.
    * great for performing arbitrary IT orchestration (e.g., zero downtime rolling updates, hotfixes, etc) as opposed
      to being configuration management specific.
    * Rather than managing systems as individual units, interaction between components and the system in general
      and Ansible is described, and the rest is taken care of by Ansible.
    * one of the most flexible IaC tools in the market right now according to the literature.
    * not limited to the features it provides and can instead be used to develop ones own modules and routines to meet
      specific needs.
    * has a rather attractive GUI for setup and monitoring.

7. Puppet
    * also takes a holistic approach to IaC setup and automation
    * runs on all operating systems and has one of the most advanced interfaces out there according to the literature.
    * uses Ruby-based Domain Scripting Language (DSL) as the primary language for defining the desired end state of the infrastructure.
      It then figures out the best way to achieve the end state.
    * monitors the infrastructure for changes that deviate away from the defined end state and automatically corrects those changes too.
    * enterprise and community support provided.

8. GitOps
    * offers a way to automate and manage infrastructure by using proven DevOps best practices such as version control, code review,
      and CI/CD pipelines.
    * discussions around GitOps are mainly in the context of Kubernetes.
    * helps simplify the provisioning and management of  complex and difficult container-based applications by applying techniques proven
      in the DevOps world.
    * revolves around 3 major components as follows:
        1. Infrastructure as code
        2. Pull requests
        3. CI/CD
    * centers around the "declarative model of IaC". Means that the configuration is more a declaration of an expected state, instead
      of a set of commands. Literature opines that it is particularly useful in the implementation of Kubernetes. For example, the
      number of pods desired for a service can be defined in the manifest. The system will then take care of itself and no need for
      an engineer to write an "imperative script" that should get to the desired pod number.
    * isn't confined to the use of declarative models. Imperatively defined environments can also be coped with.
    * main idea is that the version control system is a single source of truth.
    * deployment process requires at least 2 repos: the "application repo" (contains the source code of the app together with
      its deployment manifests) and the "environment configuration repo" (contains the desired state of the whole system described
      using a declarative specification for each environment).
    * environments can be described as dev, test, production in a code repository, containing the applications and infrastructure
      services that can run with a particular version of that environment.
    * works with any git-based system, like GitHub, BitBucket or GitLab.
    * not dependent on any tool or technology.
