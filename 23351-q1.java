import java.io.*;
import java.util.*;

class Node{
 
 int label;
 int level;
 ArrayList<Node> hs;
 Node(int label){
  this.label=label;
  hs=new ArrayList<Node>();
 }
 
 public void addAdj(Node u){
  hs.add(u);
 }
 
}

class main {

    public static void main(String args[])throws IOException{
     
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int test=Integer.parseInt(br.readLine());
     for(int ti=1;ti<=test;ti++){
     int N=Integer.parseInt(br.readLine());
     
     Node all[]=new Node[N+1];
     visited=new int[N+1];
     ts=new TreeMap<>();
     for(int i=1;i<=N;i++){
      all[i]=new Node(i);
     }
     String temp[];
     for(int i=1;i<N;i++){
      temp=br.readLine().split(" ");
      int u=Integer.parseInt(temp[0]);
      int v=Integer.parseInt(temp[1]);
      all[u].addAdj(all[v]);
      all[v].addAdj(all[u]);
     }
     all[1].level=0;
     applyDFS(all[1]);
     Node t=ts.get(ts.lastKey());
     ts=new TreeMap<>();
     for(int i=1;i<=N;i++){
      all[i].level=0;
      visited[i]=0;
     }
     applyDFS(t);
     System.out.println("Case #"+ti+": "+(ts.lastKey()+1)/2);
    }
    }
    static int visited[];
    static TreeMap<Integer,Node> ts;

    public static void applyDFS(Node n){
     //System.out.print(n.label+"("+n.level+") =>");
     visited[n.label]=1;
     Iterator it=n.hs.iterator();
     while(it.hasNext()){
      Node t=(Node)it.next();
      if(visited[t.label]==0){
       //System.out.print(t.label+" ");
       t.level=n.level+1;
       applyDFS(t);
      }
      //System.out.println(); 
     }
     ts.put(n.level,n);
    }
    
    
}