# chapter3. 연산자
## 3.1 연산자와 연산식
- 연산(operation)
  - 프로그램에서 데이터를 처리하여 결과를 산출하는 것이다.
  - 연산에서 사용되는 표시나 기호를 연산자(operator)라고 한다.
  - 연산되는 데이터는 피연산자(operand)라고 한다.
  - 연산자와 피연산자를 이용하여 연산의 과정을 기술한 것을 연산식(expressions)이라고 부른다.
    - 연산식은 반드시 하나의 값을 산출한다.
    - 보통 연산식의 값은 변수에 저장한다.
      ```java
      int result = x + y;
      ```

| 연산자의 종류 | 연산자                                                    |    피연산자 수    | 산출값               | 기능 설명                    |
|:--------|:-------------------------------------------------------|:------------:|:------------------|:-------------------------|
| 산술      | +, -, *, /, %                                          |      이항      | 숫자                | 사칙연산 및 나머지 계산            |
| 부호      | +, -                                                   |      단항      | 숫자                | 음수와 양수의 부호               |
| 문자열     | +                                                      |      이항      | 문자열               | 두 문자열을 연결                |
| 대입      | =, +=, -=, *=, /=, %=, &=, ^=, &#124;= ,<<=, >>=, >>>= |      이항      | 다양                | 우변의 값을 좌변의 변수에 대입        |
| 증감      | ++, --                                                 |      단항      | 숫자                | 1만큼 증가/감소                |
| 비교      | ==, !=, >, <, >=, <=, instanceof                       |      이항      | boolean           | 값의 비교                    |
| 논리      | !, &, &#124;, &&, &#124;&#124;                         | 단항, <br> 이항  | boolean           | 논리적 NOT, AND, OR 연산      |
| 조건      | (조건식) ? A : B                                          |      삼항      | 다양                | 조건식에 따라 A 또는 B 중 하나를 선택  |
| 비트      | ~, &, &#124;, ^                                        | 단항, <br> 이항  | 숫자, <br> boolean  | 비트NOT, AND, OR, XOR 연산   |
| 쉬프트     | <<, >>, >>>                                            |      이항      | 숫자                | 비트를 좌측/우측으로 밀어서 이동       |

## 3.2 연산의 방향과 우선순위
- 대부분의 연산자는 왼쪽에서부터 오른쪽으로 연산을 시작한다.
- 하지만 단항 연산자(++, --, ~, !), 부호 연산자(+, -), 대입 연산자(=, +=, -=, ...)는 오른쪽에서 왼쪽으로 연산된다.
- 우선 순위와 연산 방향이 정해져 있어도 괄호()를 사용해 먼저 처리해야 할 연산식을 묶는 것이 좋다.

| 연산자                                                         |     연산 방향     |  우선순위  |
|:------------------------------------------------------------|:-------------:|:------:|
| 증감(++, --), 부호(+,-), 비트(~), 논리(!)                           |  <----------  |   높음   |
| 산술(*, /, %)                                                 |  ---------->  |        | 
| 산술(+, -)                                                    |  ---------->  |        | 
| 쉬프트(<<, >>, >>>)                                            |  ---------->  |        | 
| 비교(<, >, <=, >=, instanceof)                                |  ---------->  |        | 
| 비교(==, !=)                                                  |  ---------->  |        | 
| 논리(&)                                                       |  ---------->  |        | 
| 논리(^)                                                       |  ---------->  |        | 
| 논리(&#124;)                                                  |  ---------->  |        | 
| 논리(&&)                                                      |  ---------->  |        | 
| 논리(&#124;&#124;)                                            |  ---------->  |        | 
| 조건(?:)                                                      |  ---------->  |        | 
| 대입(=, +=, -=, *=, /=, %=, &=, ^=, &#124;=, <<=, >>=, >>>=)  |  <----------  |   낮음   | 

> 1. 단항, 이항, 삼항 연산자 순으로 우선순위를 가진다.
> 2. 산술, 비교, 논리, 대입 연산자 순으로 우선순위를 가진다.
> 3. 단항과 대입 연산자를 제외한 모든 연산의 방향은 왼쪽에서 오른쪽이다.
> 4. 복잡한 연산식은 괄호()를 사용해서 우선순위를 정해준다.
