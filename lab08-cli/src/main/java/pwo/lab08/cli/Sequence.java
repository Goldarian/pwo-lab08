/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab08.cli;

 public class Sequence {

 public static void main(String[] args) {

 switch(args.length){
 case 3: (new SeqToOutApp()).run(args); break;
 case 4: (new SeqToFileApp()).run(args); break;
default: System.out.println("!Illegal arguments\n"
 + "Legal usage: seqName from to [fileName]");
 }
 }
 }
