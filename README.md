# GameKiller 

---

## 프로젝트 개요
야자시간이나 수업시간에 게임을 하는 학생들이 없어지도록 게임이 실행되면 수많은 알림창과 CPU에 부하를 가하는 바이러스를 만들어보았습니다.

## 프로젝트 작동방식
사용자가 게임을 실행 -> 로그 감지 -> 게임 종료 후 수많은 알림창을 뛰움과 동시에 cpu각 코어와 쓰레드에 무한한 연산을 할당

#### 게임이 실행되었을 때의 화면 
![KakaoTalk_20241209_180240623](https://github.com/user-attachments/assets/85b8f25b-5a24-4bd4-affd-cb3323d2e298)
### 게임이 실행 된다면 위 화면과 같이 창이 여러개를 뜨면서 게임을 종료한 후, cpu 각 쓰레드에 무한 연산을 할당하여 컴퓨터의 cpu에 부하를 가한다

