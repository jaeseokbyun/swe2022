package lesson8;
class Owner {
    private final int ownerValue;
    private final Base ownerBase;

    Owner(int ownerValue, Base ownerBase) {
        this.ownerValue = ownerValue;
        this.ownerBase = ownerBase;
    }

    @Override
    protected Owner clone() throws CloneNotSupportedException {
        //얕은 복사
        Owner result= new Owner(this.ownerValue, this.ownerBase);
        //깊은 복사
        //단일 책임 원칙. 각각의 객체는 자기 것만 짐.
        result = new Owner(this.ownerValue,this.ownerBase.clone());
        return result;
    }
}


