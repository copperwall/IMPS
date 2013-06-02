# IMPS: A MIPS Emulator written in Java

IMPS was a project for my CPE 315 Computer Architecture course. It currently only supports around 10 MIPS instructions right now, but I plan to add more as time goes on. IMPS also emulaes register pc state, and can accept input from stdin or a script file.

## Building:
```shell
 $ make
```

## Usage:
   
###    Without script file (stdin):
      
```shell
     $ java Imps [ASM_FILE]
```

###    With script file:

```shell
    $ java Imps [ASM_FILE] [SCRIPT_FILE]'
```
