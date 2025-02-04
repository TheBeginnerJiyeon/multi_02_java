// 함수 표현식

// 자바 스크립트에서 값의 성질을 가지고 있는 것을 일급 객체
// 일급객체이기 때문에 함수객체를 변수에 담을 수 있다 

// console.log(hello)

// 함수 선언문은 런타임 이전 자바스크립트 엔진에 의해 먼저 실행 된다. 
// 따라서 함수 선언문 이전에 함수를 참조할 수 있으며 호출할 수도 있다. 
// 함수 선언문이 코드의 선두로 끌어 올려진 것처럼 동작하는 자바스크립트 고유의 특징을 함수 호이스팅이라고 한다.


//함수 표현식에서는 함수명을 생략할 수 있다
let hello=function(name){ //var를 사용하면 함수 호출이 선언보다 먼저 있어도 에러는 발ㅇ생하지 않는데 호이스팅이 발생했기 때문이다
// let은 에러가 함수 선언보다 아래에서 호출해야 한다
    // return `${name}님 안녕하세욤`

    console.log("함수 호출이 되었습니다~")

    // return 반환문은 암묵적으로 생략되어있다 이때 undefined를 반환한다

    return;
}

// 안나올 때는 아웃풋을 클리어해보자
console.log(hello('홍길동'));

//함수선언문은 함수만 정의된것, 함수의 이름을 생략 할수 없는데 
//함수표현식은  함수를 변수에 담고 , 함수이름을 생략할수있다. 

//함수호출은 식별자로 이루어주고 함수 명으로 호출은 불가능 하다.

