# assik2
Code written by Java SE.
Documentation on RUS/ENG.
Methods used in the interface MyList are implemented in MyArrayList and MyLinkedList:
   int size(); //get the quantity of elements inside list
    boolean contains(Object o); // check if list contains the exact element
    void add(T element); //add element to the last position
    void add(T element, int index); // add element to the exactly index position
    T get(int index); // get element from the position
    T remove(int index); // remove element from list by index
    boolean remove(T item); // check for the existance of the element
    void clear(); //delete all elements from the list, empty list left
    int indexOf(Object o); // get the index position of the element 
    void sort(); // sort by the ascending order all element in the list
    int lastIndexOf(Object o); // returns last index of the element in the list
    ===========================================================================
    int size(); //получение количества элементов внутри списка
    boolean contains(Object o); // проверка на элемент внутри списка
    void add(T element); //добавление элемента в конец 
    void add(T element, int index); //добавление элемента в позицию индекса
    T get(int index); // получение элемента с позиции индекса
    T remove(int index); // удаление элемента с позиции индекса
    boolean remove(T item); // проверка на существование элемента
    void clear(); // очистка всего
    int indexOf(Object o); //получение индекса элемента
    void sort(); // упорядочить по возрастанию список
    int lastIndexOf(Object o); // получение позиции последнего элемента
