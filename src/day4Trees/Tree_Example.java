package day4Trees;

public class Tree_Example
{
    Dnode root;
    void createTree()
    {
        root=null;
    }
    void insertData(Dnode r,Dnode n)
    {
        if(root==null)
            root=n;
        else
        {
            if(n.data<r.data)//left
            {
                if(r.left==null)
                    r.left=n;
                else
                    insertData(r.left,n);
            }
            else
            {
                if(r.right==null)
                    r.right=n;
                else
                    insertData(r.right,n);
            }
        }
    }
    void inorder(Dnode r)
    {
        if(r!=null)
        {
            inorder(r.left);//l
            System.out.print(r.data+",");//p
            inorder(r.right);//r
        }
    }
        
     void Preorder(Dnode r) {
    	  if(r!=null) {
  		  System.out.println(r.data + ",");
  		  Preorder(r.left);
  		  Preorder(r.right);
    	  }
     }  
      void Postorder(Dnode r) {
    	  if(r!=null) {
    		  Postorder(r.left);
    		  Postorder(r.right);
    		  System.out.println(r.data + ",");
    	 
      }
  
  }
      int getHeight(Dnode r)
      {
          if(r==null)
              return 0;
          else
          {
              int LeftHeight=getHeight(r.left);
              int RightHeight=getHeight(r.right);
              return (Math.max(LeftHeight, RightHeight)+1);
          }
      }
      boolean isBalanced(Dnode r)
      {
          if(r==null)
              return true;
          else
          {
              int LeftHeight=getHeight(r.left);
              int RightHeight=getHeight(r.right);
              if(Math.abs(LeftHeight-RightHeight)>1)
                  return false;

              return (isBalanced(r.left) && isBalanced(r.right));
          }
      }
      
      
     public static void main(String[] args)
     {
         Tree_Example t=new Tree_Example();
         Dnode n1=new Dnode(100);
         t.insertData(t.root,n1);
         Dnode n2=new Dnode(50);
         t.insertData(t.root,n2);
         Dnode n3=new Dnode(20);
         t.insertData(t.root,n3);
          t.inorder(t.root);
       //  t.Preorder(t.root);
         //t.Postorder(t.root);
         System.out.println("\nHeight is:"+ (t.getHeight(t.root)-1));
         System.out.println("\nIs Tree Balanced:"+t.isBalanced(t.root));
     }
}

