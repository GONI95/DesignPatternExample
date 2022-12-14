# 싱글톤 패턴

### 싱글톤 패턴은 하나의 클래스를 기반으로 단 하나의 인스턴스를 만들어 이를 기반으로 로직을 만드는데 쓰이며, 보통 데이터베이스 연결 모듈에 많이 사용한다.

장점: 하나의 인스턴스를 생성하고 이를 공유하기 때문에 인스턴스 생성 비용이 줄어든다.

단점: 단위 테스트는 테스트가 서로 독립적이고, 테스트들을 순서에 상관없이 실행할 수 있어야하지만, 싱글턴 패턴은 미리 생성된 하나의 인스턴스를 기반으로 구현하는 패턴이므로 각 테스트마다 독립적인 인스턴스를 갖기가 어렵다. 

해결 방법: 모듈 간의 강한 결합성을 만들 수 있는 단점을 의존성 주입(DI, Dependency Injection)을 통해 해결할 수 있다.

의존성 주입 원칙: 상위 모듈은 하위 모듈에서 무엇도 가져오지 않아야하며, 둘 다 추상화에 의존하지만, 추상화가 세부 사항에 의존하지 않아야한다.
<br><br>

### 코드 설명<hr>
@Volatile: 매번 변수의 값을 Read할 때 CPU cache에 저장된 값이 아닌 Main Memory에서 읽고 write할 때 마다 Main Memory에 까지 작성

@Synchronized: 메소드에 lock을 걸어 한번에 하나의 스레드에서만 실행된다. 주의할 점은 같은 클래스의 다른 Synchronized Method와 같은 진입 조건을 가지게되어 한 메소드가 실행되는 동안 다른 메소드도 접근이 불가능해진다.

synchronized(this) {} : @Synchronized와 같이 코드 블럭에 해당되는 영역에 lock을 설정한다.



