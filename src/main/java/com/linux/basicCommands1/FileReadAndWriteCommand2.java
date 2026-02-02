package com.linux.basicCommands1;

public class FileReadAndWriteCommand2 {
    public static void main(String[] args) {
        /**
         1️⃣ cat
         Full form: concatenate
         What it does:
         Displays the entire content of a file on the terminal.
         Example:
         cat file.txt
         📌 Best for small files
         ❌ Bad for large log files (terminal floods)

         2️⃣ echo
         What it does:
         Prints text or variable values to the terminal.
         Example:
         echo Hello
         With variable:
         echo $PATH
         📌 Very common in shell scripts

         3️⃣ echo "Hello World" > demo_file.txt
         This is VERY IMPORTANT. Understand this properly.
         What happens:
         echo "Hello World" → prints text
         > → redirects output
         demo_file.txt → target file
         Result:
         Creates demo_file.txt (if not exists)
         Overwrites file content if it exists
         📌 File will contain:
         Hello World
         ⚠️ Overwrite warning
         If you want to append, use:
         echo "Hello World" >> demo_file.txt

         4️⃣ head file.txt
         What it does:
         Shows first 10 lines of a file.
         Example:
         head file.txt
         Custom lines:
         head -n 5 file.txt
         📌 Used to quickly inspect config/log files

         5️⃣ tail file.txt
         What it does:
         Shows last 10 lines of a file.
         Example:
         tail file.txt
         📌 Very common for logs

         6️⃣ tail -f file.txt
         🔥 Extremely important for backend/devops
         What it does:
         Shows last lines
         Keeps listening for new lines
         Updates live as file grows
         Example:
         tail -f application.log
         📌 Used when:
         Watching logs
         Debugging production issues
         🛑 Exit using:
         Ctrl + C

         7️⃣ less
         What it does:
         Opens a file in scrollable view mode.
         Example:
         less file.txt
         Controls:
         ↑ ↓ → scroll
         Space → next page
         /error → search
         q → quit
         ✅ Best for large files

         8️⃣ more
         What it does:
         Displays file page by page, but limited navigation.
         Example:
         more file.txt
         📌 Older command
         ❌ Cannot scroll backward easily
         👉 Use less instead in real life

         🧠 Quick Comparison
         Command	        Use Case
         cat	            Small files
         echo	            Print text / variables
         >	                Overwrite file
         >>	                Append to file
         head	            Start of file
         tail	            End of file
         tail -f	        Live logs
         less	            Large files (best)
         more	            Older paging
         */
    }
}
