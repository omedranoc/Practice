## AWS certification

+ *Access management basics*:

    + Elasticity: when horizontally scaling is used to match  capacity with demand
    + principal: a person that can make and authenticated or anonymous call.
    + Authentication: proccess to authenticate a principal against an identity
    + Identity: Objects that require authentication or are authorized to access resources.
    + Authorization: the process or denying or allowing access to a resource for an identity.
    + High availability: hardware and software that allow the system to recover quickly in case of failure
    + Fault Tolerance: system design to operate over failure.
    + recovery point objective:  The maximum time between the failure and the backup.
    + Vertical scaling: add more resources in form of cpu and memory to the existing machine.
    + Horizontal scaling: add  additional machines into a pool of resources.

+ three layer architecture: presentation, logic, data.
    + presentation: interacts with the consumer.
    + logic tier: which delivers the app functionality
    + data tier: which controls the interaction with the database.

+ Encryption:
    + the proccess to taking plain text and transform it into ciphertext.
    + generally uses an algorithm with one or more keys.
    + commonly used to encrypt data at rest or in transit.
    + The process can be symmetrical (where the same key is used for encryption and decryption) or asymmetrical where different keys are used.

+ common terms:
    + **Application state:** data that represents what a customer is doing.
    + Undifferentiated heavy lifting: A part of the system that is not specific to your business.

+ Accounts:
    + every account is isolated with a single root user for billing and access.


+ Well architected  framework:
    + Security:
        + Implement a strong identity foundation
        + Enable traceability
        + Apply Security at all layers
        + Automate security best practices
        + Protect data in transit and at rest
        + Prepare for security events
    + Reliability: The ability of the system to recover from infrastructure or service disruption.
        + Test recovery procedures
        + Automatically recover from failure.
        + Scale horizontally to increase system availability
        + Stop guessing capacity
        + manage changing automation
    + Performance efficiency:
        + Democratize advanced technologies.
        + Go global in minutes
        + use serveless architectures
        + Experiment more often
    + Operational excellence:
        + perform operations as code
        + annotate documentation
        + make frequent small changes
        + redefine operations procedures frequently
        + Anticipate failure
        + learn from failure
    + Cost Optimization
        + Adopt a consumption model
        + Measure overall efficiency
        + stop spending money at data centers
        + analyse and distribute expenditure
        + Used managed services to reduce cost of ownership
+ S3
    + Region -> bucket
    + bucket -> object
    + object -> Similar to a file, has a key and a value, can contain from zero to 5TB, has a unique name in a bucket

+ Identity and access control: control access to AWS services via polices
    1. Policies: can be attached to users, groups and roles.
        + Users are given longterm credentials.
        + roles are given temporal credentials.
        + example:
        
            + principal -> role -> policy -> credentials -> access to a s3 bucket
            + policy -> apply to groups and users -> get Credentials -> access to s3 bucket
            + there are 2 types:
                + Identity policy: when it is attached to a identity
                + resource policy: when it is attached to a resource

        + policy document:
            + List of statements
            + Each statement matches a request to AWS, request are matched based on their action.
    2. Users:  a type of identity for long term access(human, service or application)
        + principals authenticate to IAM users either with username and password or access keys

            + Principal -> username, passport ->  user(has a policy) -> access to a resource
            + Principal -> access keys -> user(has a policy) -> access to a resource

    3. Groups: Collection of users, they are not a true identity so they can not be used in resource policies.
        + Access keys:
            + Access key id: store by AWS
            + Secret access key: stored by the user

    4. Roles: they are assume by another identity allowed in the trust policy
        + when a role is asume the STS ( Security token service) generates a temporal set of access keys
        + the roles is assume if:
        + ![](images/roles.png )

+ Compute
    + Ec2 INSTANCES grouped by:
        + General purpose
        + compute optimized 
        + Memory optimized
        + Storage optimized
        + Acelerated computing
        
    + In*stances types include:
        + Low cost t2, t3 ..
    
    + Instance sizes:
        + Nano, micro, small, medium, large
        
    + EBS Elastic block store: creates and manage volumes
    
        + EBS snapshots: copies of data through time
        
        + Security groups: Software farewalls that can be attached to a network interface
        
        + Instance metadata: data related to the instance that can be accessed from inside
        
    + Amazon machine images:  are used to build instances, they store snapshots, permissions...
        + configure instance -> create the image -> launch the image
        
    + Bootstrapping is a process where the  instructions are execute  on an instance during its lunch process
     
    + Instance roles  can be assigned by EC2 using an intermediary  called instance profile
    
+ Networking 
    + VPC Virtual private cloud
        +  Isolated from other VPCs by default
        +  Regional
        +  Every VPC has a vpc router 
            + It has  an interface  in every VPC subnet known as the "subnet+1"
        + has a bastion host:
            + a host that sits  on the VPC perimeter entry point for trusted admins
        + NAT static NAT and dynamic NAT    
        + NACL network access control list: has two sets of rules inbound and outbound
        + VPC pairing: allows communication between VPCs
        + vpc endpoints: Are gateways objects created within a VPC
            + Gateways endpoints
            + Interface endpoints
        + DNS domain name service: 
            + CNAME records allows aliases to be created to certain domains
            
        + ROUTE 53
            + weighted routing: control the amount of traffic that reaches a specific resource.
            + geolocation routing
            
+ Storage and content delivery
    + s3 access is controlled using bucket policies and ACLs
        + single put upload: upload in a single stream of data
        + multiparUpload : object is broken in parts and uploaded
        + can be configure to host web pages
        + You can use presigned urls
        + storage tier that charge base on the frecuency access to the objects in the tier
            + standard, infrequent access, glacier
        + storage can be controlled with lifeCycle rules
    + cloudfront content delivery network: global cache that stores copy of your data on edge points
    
+ Databases:
    + RDBMS     
        + ACID: atomicy, consistency, Isolation, durability that affects the performance
        
    + AWS has the option of database as a service: Dbass
    + can be on 1 or multiple availability zones
    + DynamoDb NoSql
        + Table a collection of items that share the same partition key
        + Item a collection of attributes that have the same key structure
    + Dax in memory cache design for dynamoDb
    
+ Hybrid and Scaling
    + ELB elastic load balancing: Distribute incoming connections to a group of servers
        + three versions:
            + Classic CLB (application)
            + Application ALB
            + Network (NLB)
     
    + Autoscale groups: templates to  scale in or scale out based on configurable metrics, are paired with ELBs
    + Direct connect: physical connection 
    + VPN vs direct connect
        + VPN
            + can be deployed in minutes
            + Cheap and economical.
            + Encryption required
            + Flexibility to change locations
            + Short term connectivity.
            
        + Direct Connect
            + Higher throughput
            + Consistent performance
            + Consistent low latency
            + Large amounts of data
            + No contention with existing internet Connection
            
        + Both 
            
            + VPN as additional layer of HA
            + VPN if some form of connectivity is needed immediately, before the DX connection is live
            + Can be used to add encription over the top of DX
+ Snowball and snowmobile device
    + Snowball
        + 50 to 70 TB capacity
    + Snowball edge: 
        + Includes both storage and  compute
    + SnowMobile
        + Portable datacenter.

+ Data Migration: 
    + Storage gateway: Is a hybrid service that allows you to migrate data into AWS, there are three types:
        + File Gateway
        + Volume Gateway
        + Tape Gateway 
    + Database migration DMS: is a service to migrate relational databases.
+ Identity federation IDF
    + Is an architecture where identities from a external provider  are recognized
    + Types:
        + Cross account roles: A remote account is allowed to assume a role
        + SAML 2.0 IDF allow active directory users to log into AWS
        + Web Identity Federation such as google and amazon.
        + ![](images/webfederation.png )
+ Application Analytics and operations:
    + Application integration:
        + SNS: Publisher -> topic -> subscriber
        + SQS: Decouple messages from two services
    + Elastic Transcoder: Allows you to convert media files from an input media format into another.
    + Amazon athena: interactive query service, allow queries from different range of sources.
    + Elastic Map Reduce:  Is a tool for large scale parallel processing of big data
    + Kinesis: It is designed to ingest large amounts of data that can be access by the consumers.
    + RedShift: It is a warehouse database designed for analytical workloads
    + Logging and monitoring
        + CloudWatch: Produce real time monitoring
            + Data retention is based in granularity 
            + Logs Monitor and access logs form different services
                + Log events: is a timestamp and a raw message
                + Log stream: Is a sequence of events from the same source
                + Log group: Is a container for log streams
        + CloudTrail: Records account activity inside AWS
    + VPC flow logs
        + Allows you to capture metadata from the inbound and outbound traffic.
    + KMS Key management service: Provides regional, secure key management and encryption and description services.
    + ElasticBeanStalk
    + + ![](images/elasticbeanstalk.png )
    
           
            
             
    
    
    
        
    

                    
    
            
    
    
        
    
            
            
        
        

        
    