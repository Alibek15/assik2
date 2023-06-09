package interfaces;

public interface MyList<T> extends Iterable<T> {
    int size(); //get the quantity of elements inside list
    boolean contains(Object o); // check if list contains the exact element

    void add(T element); //add element to the last position
    void add(T element, int index); // add element to the exactly index position


    T get(int index); // get element from the position

    T remove(int index); // remove element from list by index
    boolean remove(T item); // check for the existance of the element
    void clear(); //delete all elements from the list, empty list left
    int indexOf(Object o); // get the index position of the element in the index
    void sort(); // sort by the ascending order all element in the list
    int lastIndexOf(Object o); // returns last index of the element in the list
    /*
    * russian version available in the entity/MyArrayList.class path
    * //
//              ..,,:::;;iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii;::1ffLLLLLLLLLLL
//             ..,,::;iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii;::::iiiiiiii;ii11ttttttttt
//          .,,,:;;;;iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii:. ,:;iiiiiiiiiiiii;;;;;;;;;;
//        .,..,:;iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii:. ,t1iiiiiiiiiiiiiiiiiiiiiiiii
//           :iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii;,  ;C00L1iiiiiiiiiiiiiiiiiiiiiii
//          :iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii;,  :tG0000Gfiiiiiiiiiiiiiiiiiiiiii
//::::::,,..;iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii:. ,tG00000000Liiiiiiiiiiiiiiiiiiiii
//;;;;iiii::iiiiiiiiiiiiiiiiiiiii;iiiiiiiiii;.  :C00000000000C1iiiiiiiiiiiiiiiiiii
//11i;::;i;;iiiiiiiiiiiiiiii;;;iiii;iiiiii;,  :f0Ct11fC0000000G1;iiiiiiii;;;;i:;ii
//11111i;:;iiiiiiiiiiiiiiiiiiiiiiii:;iii;,  ,tG00i,. .,iL000000L,:iii;;;;itlCf:ii;
//1111111i:;iiiiiiiiiiiiiiiiiiii;;iii;:,..,:t0000t,    .:l0000C;,,;;;ifCG88@@L:;;:
//11111111i;iiiiiiiiiiiiiiiiiiiiiii;;;:::;ii;f000Gt:.. .:f000L;,::;tG8@@@@88Gt:;;i
//11111111i;iiiiiiiiiiiiiiiiiiiiiii,.:,::;;ii;f0000Cft1tLG0Gf::,,iC8@@8@80CC0C;iii
//11111111;;iiiiiiiiiiiiiiiiiiii;,.  :;;:;:;ii;1C00000000Gli::,iC8@88@80CG8@@81;;i
//1111iii;;iiiiiiiiiiiiiiiiiii;,  ..:iiii;:;iii;itCGGGCLti;:::f8@888@8CC8@@@@@8L1i
//1111;;;;;;;;iiiiiiiiiiiiii;.  .iLCt;;ii;;iiiiii;;i;:::,:::;L8@888@0L0@@@@@@@@8Gf
//1111111i;;:;iiiiiiiiiiii;,  .1C0000Gt;;iiiiiiiiiii;:;;;;;;G@8888@GC8@@@@@@@8GG08
//111111i;;;;:iiiiiiiiiii:.  :LGLLLCG00C1;;iiiiiiiiiiiiii;1G@888@@CC@@@@@@@0CG8@@@
//i1111111111;;iiiiiiiii:  .1GL;,..,iL000Li;iiiiiiiiiiii;i0@888@@0C@@@@@@@CC8@@@@@
//.,;i11111111;;iiiiiii:  ;L001,    .:f000Gi:iiiiiiiii;;;C@8888@@@@@@@@8GC8@@@@@@@
//   .,:;iiiii;:;iiiii:  iGG00L:.    .;G000L,;iiii;::::::C8@@8@@@@@@@@0C0@@@@@@@@@
//        ..... .:iiii: .tGGG00L1;,..,iGGGGf.:;iii;,..,. .:f88@@@@@@@CC8@@@@@@@@@@
//                :iii;.:;tGGGG00GCLffCGGGL:,:iiii;..f0i    L@@@@@@@@8@@@@@88@@@@@
//                 ,:ii;ii;1LGGGGG00GGGGGf;::;ii;;, ;8t.    f@@@@@@@@@@@@@@@8@@@@@
//                   ,;iiiii;1LGGGGGGGGLi,:;::i1tfi .:      C@@@@@@@@@8GLC8@@@@@@@
//                    .:iiiii;i1fLCCCCt:,:;;:1C08@0i:::::;;i0@@@@@@@0LiiG@@@@@@@@@
//                      ,;iiiiii;iii;:,:;;;;t8@@8@@@88888@@@@@8888G1::f8@@@@@@@@@@
//                       .:iiiiiiii;;;;iii;f8@@@@@@@@@@@@@@@@@@8Gi,,t08G0@@@@@@@@@
//                         ,;iiiiiiiiiiii;i8@80GG@@@@@@@@@@@@@@8t:1G80G88888@@@@@@
//                          .:iiiiiiiiiii;180CC0@@@@@@@@@@@@@@@CL08008@@888@@@@@@@
//                            :iiiiiiiiii;;CG88@@@@@8GG8@@@@@@@@@@@@@888@@@@@@@@@@
//                            ,iiiiiiii;:::0@@8@@8GGG0@@@@@@888@@@@@@@@@@@@@@@@@@@
    * */


}
