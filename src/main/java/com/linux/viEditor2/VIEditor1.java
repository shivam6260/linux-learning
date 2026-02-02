package com.linux.viEditor2;

public class VIEditor1 {
    public static void main(String[] args) {
        /**
         vim = Vi Improved (almost always installed).


         vi does NOT work like Notepad.
         It has modes.

         1️⃣ Normal Mode (DEFAULT)
         You start here
         Used for navigation & commands
         You CANNOT type text here
         📌 Press Esc anytime → go to Normal mode

         2️⃣ Insert Mode
         Used to write/edit text
         To enter Insert mode:

         Key	Meaning
         i	Insert before cursor
         I  Insert at beginning of line
         📌 Press Esc to exit Insert mode

         3️⃣ Command Mode (Last Line Mode)
         Used to save, quit, search, replace
         Enter using:
         :


         These are all command for Normal mode - vim shivam.txt

         🧭 BASIC NAVIGATION (Normal Mode)
         | Command | Action         |
         | ------- | -------------- |
         | `0`     | start of line  |
         | `$`     | end of line    |
         | `gg`    | top of file    |
         | `G`     | bottom of file |
         | `:10`   | go to line 10  |

         ❌ DELETE / CUT (Normal Mode)
         | Command | Action                  |
         | ------- | ----------------------- |
         | `x`     | delete character        |
         | `dd`    | delete entire line      |
         | `dw`    | delete word             |
         | `d$`    | delete till end of line |
         | `D`     | same as d$              |

         📋 COPY (YANK) & PASTE
         | Command | Action        |
         | ------- | ------------- |
         | `yy`    | copy line     |
         | `yw`    | copy word     |
         | `y$`    | copy till end |

         Paste:
         | Command | Action              |
         | ------- | ------------------- |
         | `p`     | paste after cursor  |
         | `P`     | paste before cursor |

         ↩️ UNDO / REDO
         | Command    | Action |
         | ---------- | ------ |
         | `u`        | undo   |
         | `Ctrl + r` | redo   |

         🔍 SEARCH
         /text

         | Key | Action         |
         | --- | -------------- |
         | `n` | next match     |
         | `N` | previous match |

         💾 SAVE & QUIT (Command Mode)
         | Command | Action              |
         | ------- | ------------------- |
         | `:w`    | save                |
         | `:q`    | quit                |
         | `:wq`   | save & quit         |
         | `:q!`   | quit without saving |
         | `:w!`   | force save          |
         | `ZZ`    | save & exit         |

         🚨 Most common beginner panic:
         “I’m stuck in vi”

         Fix:
         Esc → :q! → Enter


         */
    }
}
