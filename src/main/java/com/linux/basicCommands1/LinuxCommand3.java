package com.linux.basicCommands1;

public class LinuxCommand3 {
    public static void main(String[] args) {
        /**
         1️⃣ cp newFile.txt devops/
         What it does:
         Copies a file into a directory.
         Result:
         newFile.txt remains in current folder
         A copy is created inside devops/
         📌 If file exists in destination → it gets overwritten (no warning unless -i)

         2️⃣ cp -r cloud/ devops/
         What it does:
         Copies a directory and all its contents.
         Flags:
         -r → recursive (mandatory for folders)
         📌 Used for:
         Project backups
         Moving configs
         Cloning directory structure

         3️⃣ mv shivam.txt ../devops/cloud/
         What it does:
         Moves file to another directory.
         Explanation:
         shivam.txt → moved
         .. → parent directory
         Target → devops/cloud/
         📌 After this, file will not exist in original location.

         4️⃣ mv devops/ devops-linux
         What it does:
         Renames a directory.
         📌 mv is used for both move and rename

         5️⃣ mv shivam.txt shivam-shweta.txt
         What it does:
         Renames a file.
         📌 No data change, only name change.

         6️⃣ wc demo_file.txt
         What it does:
         Counts lines, words, and bytes.
         Output format:
         lines  words  bytes  filename
         Useful flags:
         wc -l file.txt   # lines
         wc -w file.txt   # words
         wc -c file.txt   # bytes
         📌 Very useful in logs & data files.

         7️⃣
         ln -s /home/ubuntu/linux-for-devops/cloud/devops-file.txt /home/ubuntu/softlink-file
         🔗 Soft link (Symbolic link)
         What it does:
         Creates a shortcut to another file.
         📌 Properties:
         Points to file path
         Breaks if original file is deleted
         Can cross file systems
         Check:
         ls -l
         You’ll see -> arrow.

         8️⃣
         ln devops-file.txt /home/ubuntu/hardlink-file
         🔗 Hard link
         What it does:
         Creates another reference to same file data.
         📌 Properties:
         Same inode
         File data exists until all links are deleted
         Cannot link directories
         Same filesystem only

         🧠 Important difference

         Soft link	                Hard link
         Shortcut	                Actual reference
         Breaks if source deleted	File survives
         Different filesystem	    Same filesystem

         9️⃣ tee
         🔥 Very powerful, often ignored
         What it does:
         Reads from input and writes to:
         Terminal
         File (simultaneously)
         Example
         echo "hello" | tee file.txt
         📌 Useful in scripts and logging.
         Append mode:
         command | tee -a file.txt

         🔟 sort hello.txt
         What it does:
         Sorts file content alphabetically.
         Does NOT modify file (prints output).
         Common options:
         sort -r file.txt   # reverse
         sort -n file.txt   # numeric
         sort -u file.txt   # unique
         📌 Used in logs, reports, data processing.

         1️⃣1️⃣ clear
         What it does:
         Clears terminal screen.
         Shortcut:
         Ctrl + L
         📌 No effect on data or commands.

         1️⃣2️⃣ diff dem_file.txt hello.txt
         What it does:
         Shows line-by-line differences between two files.
         📌 Very common in:
         Config comparison
         Debugging
         Code reviews
         Exit codes:
         0 → files same
         1 → differences
         >1 → error

         🧠 Summary Table
         Command	            Purpose
         cp	                    Copy files
         cp -r	                Copy directories
         mv	                    Move / Rename
         wc	                    Count lines/words
         ln -s	                Soft link
         ln	                    Hard link
         tee	                Output to file + screen
         sort	                Sort text
         clear	                Clear terminal
         diff	                Compare files
         */
    }
}
