package lesson8;

class Base {
    int baseValue;

    public Base(int baseValue){
        this.baseValue= baseValue;
    }
    @Override
    protected Base clone() throws CloneNotSupportedException{
        //구현은 우리에게 달림. 이제부터 복사본 요청할 거라는 프로토콜. 보편적 오브젝트에 규정됌
        return new Base(this.baseValue);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null) return false;  //가장 부하가 적고 제일 일찍 배제하는 게 좋음. runtime error 가능성
        if(!(obj instanceof Base)) return false;
        if(obj.hashCode() == this.hashCode()) return true;
        //일반적(추상적)인 상황에서부터 배제.
        return this.baseValue==((Base)obj).baseValue;
        //  if 문이 3번 반복되기 시작하면 ㅂㅂ 2번까지가 최대.
        //  따라서 다음과 같은 쉴드 패턴 사용 위쪽이 큰 집합, 아래쪽이 작은 집합. technic
        //  바르게 제어문 쓰는게 첫 걸음... 흐름 제어!가 최대
    }

    @Override
    public String toString(){
        return "base: " + this.hashCode()+":value="+this.baseValue;
    }
}
