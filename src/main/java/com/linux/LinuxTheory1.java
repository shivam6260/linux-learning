package com.linux;

public class LinuxTheory1 {
    /**
     Theory 1
     In Linux -
     1 Hardware 🧱
     Physical parts of the computer
     → CPU, RAM, Disk, Keyboard, Network card

     2 Kernel (Linux kernel) ⚙️
     The core of the OS
     → Talks directly to hardware
     → Manages CPU, memory, disk, processes

     3 Shell 🖥️
     The command interface
     → Lets users talk to the kernel
     → Examples: bash, zsh

     4 Applications 📦
     Programs you use
     → Browser, Java app, MySQL, Nginx


     Theory 2
     🧠 What does the Kernel contain?

     Kernel is the brain + manager of the OS. Inside kernel you have:

     Process Management
     → Runs programs, stops them, switches CPU between them

     Memory Management
     → Allocates RAM, frees RAM, handles virtual memory

     Device Drivers
     → Controls hardware (disk, keyboard, network, USB)

     File System Management
     → Reads/writes files, permissions

     Networking Stack
     → TCP/IP, ports, packets

     👉 Kernel decides who gets CPU, memory, disk, network and when.



     Theory 3
     In Linux, everything starts from the root directory /.

     cd /

     you move to the top of the entire filesystem tree.

     There is only one root (not like Windows C:, D:).

     Basic Linux Folder Structure (important ones)
     /
     ├── bin
     ├── boot
     ├── dev
     ├── etc
     ├── home
     ├── lib
     ├── media
     ├── mnt
     ├── opt
     ├── proc
     ├── root
     ├── run
     ├── sbin
     ├── tmp
     ├── usr
     └── var

     🔑 Important directories (simple meaning)
     1 /bin
     Essential commands
     ls, cp, mv, cat

     2 /etc
     Configuration files
     Examples:
     /etc/nginx/nginx.conf
     /etc/hosts
     /etc/passwd
     👉 Most backend debugging happens here

     3 /home
     User home directories
     Example:
     /home/shivam
     👉 Your normal working area

     4 /root
     Home directory of root user
     Different from /

     5 /var
     Variable data (changes often)
     Logs, runtime data
     Examples:
     /var/log
     /var/lib/mysql
     👉 Check logs here when app fails

     6 /usr
     User-installed software & libraries
     Examples:
     /usr/bin
     /usr/lib
     /usr/local
     👉 Most applications live here

     7 /tmp
     Temporary files
     Cleared on reboot

     8 /boot
     Bootloader & kernel files
     Example:
     vmlinuz
     ⚠️ Don’t touch unless you know what you’re doing

     9 /dev
     Device files
     Disk, USB, network devices
     Example:
     /dev/sda

     10 /proc
     Virtual filesystem
     Kernel & process info
     Example:
     /proc/cpuinfo
     /proc/meminfo
     👉 Great for debugging performance






     What is Linux?

     Linux is a kernel, not a complete operating system.

     Kernel = core engine of the OS
     It manages:
     CPU
     Memory
     Hardware
     Processes

     Think of Linux as the engine of a car 🚗 — powerful, but not usable alone.

     Examples of things based on the Linux kernel:
     Android
     Ubuntu
     Red Hat
     CentOS
     Debian

     2️⃣ What is Ubuntu?
     Ubuntu is a Linux distribution (distro).

     It includes:
     Linux kernel
     Desktop environment (GUI)
     Package manager (apt)
     System tools
     Pre-installed software
     Regular updates & support

     Think of Ubuntu as a fully assembled car, ready to drive.

     Linux = Engine
     Ubuntu = Car with engine + body + dashboard + AC
     You drive Ubuntu, not Linux directly.

     5️⃣ When people say “Linux”, what do they usually mean?

     Most people casually say “Linux” but actually mean:
     Ubuntu
     Red Hat
     CentOS
     Fedora

     Because they are Linux-based operating systems.
     Linux is the kernel; Ubuntu is a Linux-based operating system built on top of it.

     */
}
