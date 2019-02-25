/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author jjaikumar
 */
public class Cache {
    private int sizeOfMemory;
    private Cache lowerLevelMemory;
    private int waitCycles;
    private int counter;
    private char[] mem_array;
    private int[] tag_array;
    private int heirarchy;
    
    public Cache(int sizeOfMemory, Cache lowerLevelMemory, int waitCycles) {
        this.sizeOfMemory = sizeOfMemory;
        this.lowerLevelMemory = lowerLevelMemory;
        this.waitCycles = waitCycles;
        this.counter = waitCycles;
        
        this.mem_array = new char[sizeOfMemory];
        this.tag_array = new int[sizeOfMemory];
    }

    private void delayCounter() {
        this.counter = this.counter--;
    }
    
    public int getHeirarchy()           {   return heirarchy;               }
    public int getSizeOfMemory()        {   return sizeOfMemory;            }
    public int getWaitCycles()          {   return waitCycles;              }
    public int getCounter()             {   return counter;                 }
    public char[] getMemArray()         {   return mem_array;               }
    public int[] getTagArray()          {   return tag_array;               }
    public Cache getNextCache()         {   return lowerLevelMemory;        }
    public char getData(int address)    {   return this.mem_array[address]; }
    
    public void setHeirarchy(int level){
        this.heirarchy = level;
    }
    public void setTagArray(int data, int address)   {   
        this.tag_array[address] = data; 
    }
    public void setData(char data, int address){
        this.mem_array[address] = data;
    }
}


class NoSuchMemoryLocationException extends Exception {
    int address;
    public NoSuchMemoryLocationException(int address){
        this.address = address;
        System.out.println("No such memory location exists: "+ address);
    }
    public NoSuchMemoryLocationException(){
        System.out.println("No such memory location exists");
    }
}