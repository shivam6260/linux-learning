package com.linux;

public class SSHAndKeyPair2 {
    public static void main(String[] args) {
        /**
         What actually happened when you created an EC2 (Ubuntu)?

         You created:

         A remote Linux (Ubuntu) machine
         It is running somewhere in AWS data center
         There is NO screen, keyboard, mouse

         So now the real question is:
         How do I log in to that machine securely?
         That’s where SSH and key pair come in.

         2️⃣ What is SSH? (VERY IMPORTANT)
         SSH = Secure Shell
         It is a secure way to connect to a remote Linux server over the internet.

         SSH allows you to:
         Login to EC2
         Run commands
         Install software
         Deploy applications

         Example:
         ssh ubuntu@13.234.xx.xx

         This means:
         “Open a secure terminal session to that Ubuntu machine”

         🔐 Secure means:
         Encrypted
         No one can read your password or commands

         3️⃣ Why NOT username + password?
         AWS does NOT allow password login by default because:

         Passwords can be:
         Guessed
         Brute-forced
         Leaked

         For servers, password login = ❌ security risk
         So AWS uses key-based authentication.

         4️⃣ What is a Key Pair? (THIS IS THE CORE CONCEPT)

         A key pair has two parts:
         🔑 1. Private Key (YOU keep this)
         File like: my-key.pem
         Stored on your laptop
         Never share this
         Like your house key

         🔓 2. Public Key (AWS stores this)
         Stored inside EC2 automatically
         Like a lock on the door

         5️⃣ How login works (step-by-step, simple)

         When you run:
         ssh -i my-key.pem ubuntu@<EC2-IP>

         Behind the scenes:
         Your laptop says:
         “I want to login”

         EC2 says:
         “Prove it’s you”

         Your laptop uses private key to prove identity
         EC2 checks:
         “Does this match my public key?”

         Match found ✅ → Login allowed
         No match ❌ → Access denied

         🧠 Important:
         Your private key is never sent to AWS.

         6️⃣ Real-life analogy (remember forever)
         EC2 server = Your house 🏠
         Public key = Lock on the door 🔒
         Private key = Your physical key 🔑

         Anyone can see the lock
         Only you have the key
         Without key → no entry

         7️⃣ Why AWS forces key pair?

         Because:

         Much more secure than passwords
         No brute-force attacks
         Industry standard for servers


         👉 Use SSH keys, not passwords

         9️⃣ Quick summary (INTERVIEW READY)

         SSH: Secure way to connect to a remote Linux server
         Key pair: Password-less authentication using cryptography
         Private key: Stays with you
         Public key: Stored on server
         Why used: Security, no password attacks

         10️⃣ One-liner (VERY IMPORTANT)
         We use SSH key pairs in EC2 to securely login to a remote Linux server without using passwords.



         You already understand key pair, so now let’s zoom in on SSH itself.
         I’ll be very clear and a bit strict so this really clicks.

         1️⃣ First: what SSH is NOT
         SSH is NOT:
         just a key
         just a login command
         just EC2 thing
         Those are things SSH uses, not what it is.


         2️⃣ So… what IS SSH?
         SSH = a secure communication protocol
         A protocol = a set of rules for how two computers talk.

         SSH defines:
         how two machines identify each other
         how they encrypt data
         how they send commands securely
         how they receive output securely

         💡 SSH is like HTTPS, but for terminal access instead of websites.

         3️⃣ What problem did SSH solve?

         Before SSH, people used Telnet.
         Telnet problem:
         Password sent in plain text
         Anyone sniffing network could see:

         username: root
         password: admin123


         SSH solved this by:
         ✔ Encryption
         ✔ Identity verification
         ✔ Secure remote control

         4️⃣ What exactly happens when you type ssh ...?

         Let’s break it down step by step (this is the core).

         You type:
         ssh -i my-key.pem ubuntu@<EC2-IP>

         This does FOUR major things.

         🔹 Step 1: TCP connection (basic networking)
         Your machine opens a connection to:
         EC2-IP : port 22

         Port 22 is the default SSH port
         👉 At this point, no security yet, just a connection.

         🔹 Step 2: SSH handshake (HELLO phase)
         Both machines say:
         “I speak SSH version X”
         “I support these encryption algorithms”

         They agree on:
         encryption method (AES, ChaCha, etc.)
         key exchange algorithm

         👉 This is like deciding:
         “How will we speak secretly?”

         🔹 Step 3: Secure channel creation (VERY IMPORTANT)

         Using cryptography:
         A temporary secret key is created
         This key is known only to:
         your laptop
         EC2 instance

         From now on:
         🔐 Everything is encrypted
         Commands
         Output
         Even errors

         🔹 Step 4: Authentication (this is where key pair comes)

         Now EC2 asks:
         “Who are you?”
         You reply:
         “I am ubuntu user, here is proof”

         Proof = private key signs a message
         EC2 checks:
         Does this match my stored public key?

         ✔ Match → login success
         ❌ No match → access denied

         ⚠️ Key pair is only one part of SSH (authentication).

         5️⃣ After login: what is SSH doing continuously?
         Once logged in:

         SSH:
         Sends your keystrokes securely
         Receives output securely
         Maintains session
         Detects disconnects


         Flow:

         Your keyboard → SSH → Encrypted → Internet →
         EC2 → Decrypted → Linux shell → Output →
         Encrypted → Back to you

         6️⃣ What SSH actually provides (3 pillars)

         SSH provides three things:

         1️⃣ Encryption
         No one can read your data

         2️⃣ Authentication
         Server knows you are authorized

         3️⃣ Integrity
         Data cannot be altered in transit

         */
    }
}
