class Open
{
        void show(String str)
        {       
                System.out.println("String version");
        }       
        void show(StringBuffer str)
        {       
                System.out.println("String Buffer Version");
        }       
        public static void main(String args[])
        {       
                Open o = new Open();
        //      o.show();
                o.show("Hello");
                o.show(new Stringbuffer());
              // o.show(new Object());
        }       
}       
