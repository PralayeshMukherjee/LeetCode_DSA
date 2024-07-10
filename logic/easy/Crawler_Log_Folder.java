//https://leetcode.com/problems/crawler-log-folder/description/?envType=daily-question&envId=2024-07-10

//1598. Crawler Log Folder

class Solution {
    public int minOperations(String[] logs) {
        int directory = 0;
        for(int i=0;i<logs.length;i++){
            if(logs[i].equals("../")){
                if(directory>0){
                    directory--;
                }
            }else if(logs[i].equals("./")){
                continue;
            }else{
                directory++;
            }
        }
        return directory;
    }
}