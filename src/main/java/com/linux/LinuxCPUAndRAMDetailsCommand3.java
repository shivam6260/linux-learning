package com.linux;

public class LinuxCPUAndRAMDetailsCommand3 {
    /**
     df -h          # Disk
     free -h        # RAM
     nproc          # CPU cores
     lscpu          # CPU details
     cat /etc/os-release  # OS info

     To transfer any file from local to Amazon EC2 Instance
     scp -i shivam-amazon-ec2-key-pair.pem GPT.txt ubuntu@ec2-54-82-118-14.compute-1.amazonaws.com:/home/ubuntu
     */
}
