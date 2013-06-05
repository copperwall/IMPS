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

## List of supported operations:
1. add
1. addi
1. sub
1. and
1. or
1. sll
1. sllv
1. srl
1. srlv
1. slt
1. sw
1. lw
1. beq
1. bne
1. j
1. jal
1. jr

I'll be adding more as time allows.
