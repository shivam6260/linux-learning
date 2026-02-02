package com.linux.basicCommands1;

public class LinuxBasicCommand1 {
    public static void main(String[] args) {
        /**
         1 date
         Gives you today date and UTC time

         1️⃣ ls
         What it does:
         Lists files and folders in the current directory.
         Example:
         ls
         Output:
         Shows file and folder names only.

         2️⃣ mkdir
         What it does:
         Creates a new directory (folder).
         Example:
         mkdir myfolder
         Creates a folder named myfolder.

         3️⃣ ls -l
         What it does:
         Lists files with detailed information.
         Example:
         ls -l
         Shows:
         File permissions
         Owner
         Group
         File size
         Date & time
         File name

         4️⃣ pwd
         What it does:
         Shows current directory path.
         Example:
         pwd
         Output example:
         /home/shivam/projects

         5️⃣ touch
         What it does:
         Creates an empty file.
         Example:
         touch file.txt

         6️⃣ cd
         What it does:
         Changes directory.
         Example:
         cd myfolder
         Moves into myfolder.
         📌 Think of it as entering a folder

         7️⃣ cd ..
         What it does:
         Moves one directory up (parent directory).
         Example:
         cd ..
         📌 Used when you want to go back

         8️⃣ ls -lrth
         This is a combination of options.
         Breakdown:
         -l → long listing
         -r → reverse order
         -t → sort by time
         -h → human readable size (KB, MB)
         Example:
         ls -lrth
         📌 Very common command in servers & production
         📌 Shows latest files at the bottom

         9️⃣ rm
         ⚠️ Dangerous command
         What it does:
         Deletes a file permanently (no recycle bin).
         Example:
         rm file.txt
         📌 Once deleted, cannot be recovered easily

         🔟 rm -r
         ⚠️ VERY DANGEROUS
         What it does:
         Deletes a directory and everything inside it.
         Example:
         rm -r myfolder
         📌 This will delete:
         folder
         all files inside
         all subfolders
         🚨 Never run blindly, especially as root

         🧠 Quick Summary Table
         Command	    Purpose

         ls	            List files
         mkdir	        Create directory
         ls -l	        Detailed file list
         pwd	        Show current path
         touch	        Create empty file
         cd	            Change directory
         cd ..	        Go back
         ls -lrth	    Detailed sorted list
         rm	            Delete file
         rm -r	        Delete folder recursively

         */
    }
}
