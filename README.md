자동차 게임 기능 목록 맟 도메인 추출

자동차 (Car)

- 자동차는 이름과 거리를 갖는다 (Name, Distance)
- 자동차의 거리는 전진 또는 멈춤으로 결정 된다 (Distance)
- 자동차가 전진하는 조건은 랜덤 값 4 이상이다 (Distance + 랜 조건 판단)
- 자동차의 이름은 5자 이하만 가능하다 (Name)

사용자

- 몇번의 게임을 진행할지 입력한다 (InputView)
- 게임을 진행할 다수의 자동차 이름을 ','기준으로 입력한다

게임 진행

- 사용자의 입력이 잘못될 경우 에러메세지를 출력하고 입력을 다시 받는다 (InputView)
- 입력 받은 횟수 만큼 게임을 진행한다 (테스트 어려움. 2가지 도메인 섞임)
- 이름을 잘라서 이름 만큼 자동차를 생성한다 (Cars)

결과 출력

- 이름과 전진한 횟수를 '-'기호를 통해 출력한다
- 우승자를 출력하고 다수일 경우 ',' 구분지어 출력한다

도메인 객체 추출

- 사용자 : n번의 이동, m대의 자동차 이름 입력
- 자동차 : 이름과 위치값을 갖음
- 자동차들 : 한번에 게임이 m대의 자동차들이 움직인다
- 게임 : n번 진행된다
- 직진 조건 : 랜덤 4이상일 경우 자동차에 위치값을 +1한다
- 결과 : n번 진행에 대한 자동자들의 결과를 갖음, 우승자를 판단.
- 출력 : 전진횟수만큼 '-'기호로 이름과 함꼐 출력한다. 우승자를 출력한다

