interface Subject {

    void attach(Observer o);

    void detatch(Observer o);

    void notifyListeners();

}