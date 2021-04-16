package kafka.admin

import org.junit.Test

/**
  * AclCommandTest
  *
  * @author chenqixu
  */
class AclCommandTest1 {

  /**
    * [2021-04-16 15:40:38,865] WARN Unable to reconnect to ZooKeeper service, session 0x178c3db58820014 has expired (org.apache.zookeeper.ClientCnxn:1285)
    * Adding ACLs for resource `Topic:nmc_tb_lte_s1mme_new`:
    * User:newland has Allow permission for operations: Read from hosts: 10.1.2.212
    *
    * [2021-04-16 15:41:55,589] WARN Client session timed out, have not heard from server in 59776ms for sessionid 0x178c3db58820015 (org.apache.zookeeper.ClientCnxn:1108)
    * [2021-04-16 15:41:57,042] WARN Unable to reconnect to ZooKeeper service, session 0x178c3db58820015 has expired (org.apache.zookeeper.ClientCnxn:1285)
    * [2021-04-16 15:42:09,712] WARN Unable to reconnect to ZooKeeper service, session 0x178c3db58820016 has expired (org.apache.zookeeper.ClientCnxn:1285)
    * Adding ACLs for resource `Group:new_consumer_api`:
    * User:newland has Allow permission for operations: Read from hosts: 10.1.2.212
    *
    * [2021-04-16 15:42:14,368] WARN Client session timed out, have not heard from server in 4152ms for sessionid 0x178c3db58820017 (org.apache.zookeeper.ClientCnxn:1108)
    * Current ACLs for resource `Topic:nmc_tb_lte_s1mme_new`:
    * User:admin has Allow permission for operations: Describe from hosts: 10.1.12.51
    * User:alice has Allow permission for operations: Write from hosts: 10.1.2.203
    * User:admin has Allow permission for operations: Read from hosts: 10.1.8.205
    * User:newland has Allow permission for operations: Read from hosts: 10.1.8.201
    * User:admin has Allow permission for operations: Describe from hosts: 10.1.8.203
    * User:alice has Allow permission for operations: Describe from hosts: 10.1.8.203
    * User:newland has Allow permission for operations: Describe from hosts: 10.1.8.204
    * User:newland has Allow permission for operations: Describe from hosts: 10.1.8.81
    * User:admin has Allow permission for operations: Read from hosts: 10.1.8.75
    * User:newland has Allow permission for operations: Read from hosts: 10.1.8.202
    * User:alice has Allow permission for operations: Write from hosts: 10.1.8.203
    * User:newland has Allow permission for operations: Read from hosts: 10.1.2.129
    * User:admin has Allow permission for operations: Read from hosts: 10.1.2.129
    * User:newland has Allow permission for operations: Describe from hosts: 10.1.8.200
    * User:admin has Allow permission for operations: Describe from hosts: 10.1.8.78
    * User:newland has Allow permission for operations: Describe from hosts: 10.1.8.75
    * User:newland has Allow permission for operations: Read from hosts: 10.1.8.81
    * User:admin has Allow permission for operations: Read from hosts: 10.1.8.81
    * User:newland has Allow permission for operations: Read from hosts: 10.1.8.200
    * User:newland has Allow permission for operations: Read from hosts: 10.1.8.205
    * User:alice has Allow permission for operations: Read from hosts: 10.1.8.203
    * User:admin has Allow permission for operations: Describe from hosts: 10.1.8.202
    * User:admin has Allow permission for operations: Read from hosts: 10.1.12.51
    * User:newland has Allow permission for operations: Describe from hosts: 10.1.8.205
    * User:admin has Allow permission for operations: Describe from hosts: 10.1.8.75
    * User:admin has Allow permission for operations: Describe from hosts: 10.1.8.81
    * User:newland has Allow permission for operations: Describe from hosts: 10.1.2.212
    * User:admin has Allow permission for operations: Read from hosts: 10.1.8.202
    * User:admin has Allow permission for operations: Read from hosts: 10.1.8.203
    * User:alice has Allow permission for operations: All from hosts: 10.1.2.212
    * User:newland has Allow permission for operations: Read from hosts: 10.1.8.78
    * User:alice has Allow permission for operations: Describe from hosts: 10.1.2.203
    * User:admin has Allow permission for operations: Describe from hosts: 10.1.2.129
    * User:admin has Allow permission for operations: Describe from hosts: 10.1.8.201
    * User:newland has Allow permission for operations: Read from hosts: 10.1.8.204
    * User:newland has Allow permission for operations: Describe from hosts: 10.1.8.202
    * User:newland has Allow permission for operations: Describe from hosts: 10.1.8.78
    * User:newland has Allow permission for operations: Read from hosts: 10.1.2.212
    * User:alice has Allow permission for operations: Read from hosts: 10.1.2.203
    * User:admin has Allow permission for operations: Read from hosts: 10.1.8.201
    * User:newland has Allow permission for operations: Describe from hosts: 10.1.2.129
    * User:admin has Allow permission for operations: Read from hosts: 10.1.8.200
    * User:admin has Allow permission for operations: Read from hosts: 10.1.8.204
    * User:admin has Allow permission for operations: Describe from hosts: 10.1.8.204
    * User:newland has Allow permission for operations: Describe from hosts: 10.1.8.201
    * User:newland has Allow permission for operations: Describe from hosts: 10.1.8.203
    * User:admin has Allow permission for operations: Describe from hosts: 10.1.8.200
    * User:admin has Allow permission for operations: Read from hosts: 10.1.8.78
    * User:newland has Allow permission for operations: Read from hosts: 10.1.8.203
    * User:admin has Allow permission for operations: Describe from hosts: 10.1.8.205
    * User:newland has Allow permission for operations: Read from hosts: 10.1.8.75
    *
    * Current ACLs for resource `Group:new_consumer_api`:
    * User:alice has Allow permission for operations: Read from hosts: *
    * User:alice has Allow permission for operations: Describe from hosts: 10.1.8.202
    * User:newland has Allow permission for operations: Read from hosts: 10.1.2.212
    */
  @Test
  def aclAdd(): Unit = {
    val args = Array("--authorizer-properties", "zookeeper.connect=edc-mqc-01:2181"
      , "--add", "--allow-principal", "User:newland", "--allow-host", "10.1.2.212"
      , "--operation", "Read", "--group=new_consumer_api", "--topic", "nmc_tb_lte_s1mme_new")
    AclCommand.main(args)
  }
}
