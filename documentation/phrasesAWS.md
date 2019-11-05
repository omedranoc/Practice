## phrases

+ most cost-effective
+ To be summarized, analitics, business intelligence: RedShift
+ Least operational and administrative interference: API gateway along with lambda
+ activity cloudtrail, can be enable all regions
+ Scaling: Autoscaling
+ data streaming or analytics: kinesis
+ temporal access s3, particular access: Pre-signed url
+ Backup: volumes snapshots
+ read replicas read only query, replication lag, asynchronously.
+ identity authenticate
+ Monitor health: route 53
+ ami, disaster recover
+ KMS master keys are region specific 
+ Remember to delete the snapshots from redshift
+ Storage gateway, data migration, extend storage
+ athena queries
+ VPC flow logs: logs IP traffic
+ Static content: s3
+ Route 53 alias
+ BLUE/GREEN weighted route 53
+ Nat instance, for botleNecks change it to a  nat gateway
+ security groups block inbound by default, ssh
+ Direct connect does not involves the internet
+ vpc one subnet for each availability zone
+ RDS instance: if it is not an RDS instance it can not enable multi-az
+ changes apply to the security group are immediately
+ Fargate: technology to run containers
+ Glacier: Expedited retrieval 3-5 minutes, normal retrieval: hours
+ Cloud trail log file validation: to verify the integrity of files
+ SSE-S3 manage the keys, KMS; manage the data but you manage the master key
+ spikes cost effective:  Autoscale dynamoDb
+ CloudFront grant access to objects using Origin access identity
+ throttle: Decrease the flow of something
+ EBS is replicated  within their availability zones
+ Content body
+ sqs message group id: multiple producers and consumers
+ Security groups: Act at an instance level
+ EBS block level storage(storage that emulates a hard disk)
+ In house: customer
+ Transit vpc: Different regions
+ Autohealing environment: autoscaling groups web servers, multiAz db, elb
+ EbS blocks are replicated within their availability zones.
+ Identical: unique deduplication
+ LAMP is an acronym, and these stacks typically consist of the Linux operating system, the Apache HTTP Server, the MySQL relational database management system, and the PHP programming language
+ CodeCommit eliminates the need to operate your own source control system.
+ AWS CodeDeploy: Coordinate application deployments to Amazon EC2 instances
+ NAT gateway:  communication of instances in a private subnet to internet
+ Disaster: another region
+ When there is a change in s3 bucket, events are filtered using AWS cloudtrail  and then amazon cloudwatch is used to trigger the start of the pipeline
+ Security groups act in the instance level not in the subnet level.
+ Security groups are stateful: you dont need to define a rule for outbound traffic
+ Security groups: allow traffic internet https inbound 443 0.0.0.0/0 
+ cloudFormation: returned = output
+ VPC peering does not on premises communication, and it also needs no overlapping CIDR blocks
+ VPN connection on promises:  use a virtual private gateway
+ HSM cloud hardware security module: you have to manage the keys.
+ EBS incremental backups: only the blocks that have changed are modified.
+ Load balancers does not support custom security policies.
+ NLB network load balancer uses a security policy that consists on protocols and ciphers
+ cipher: algorithm to perform encryption and decryption
+ Cluster placement groups one uses is to reduce latency  between them
+ Notifications are done in the s3 bucket not in the object
+ Aws managed blockchain: ResourceID.MemberID.NetworkID.managedblockchain.AWSRegion.amazonaws.com:PortNumber
+ Read Replicas provide enhanced performance and durability for database (DB) instances. This feature makes it easy to elastically scale out beyond the capacity constraints of a single DB instance for read-heavy database workloads. 
+ EC2 hibernate state: compute capacity charges are not applicable
+ Code deployed can just be used if the resourses are already deployed
+ Webhooks are used to trigger the pipeline on changes on the git repository along with periodic checks
+ Virtual private gatewages are managed by AWS
+ Api monitoring service:  cloudtrail, logging cloudwatch and awwconfig asses audit and evaluate the configurations of your AWS
+ Throttling: chocking, strangling
+ Vpc gateway: s3 and dynamoDb. VPC interface: kinesis
+ codepipeline: build test and deploy
+ Read replicas performance RDS databases too
+ Coverage budget: Number of instances that are part of the reserved instance
+ Dedicated host: Instances run on a dedicated server.
+ Route 53 weighed routing: How much traffic is routed to each resource 
+ Route 53 simple routing: traffic is route based on the dns records
+ cross-account: allow customers to securely grant access to aws resources to their accounts 
+ Amazon DynamoDB Accelerator (DAX)

 