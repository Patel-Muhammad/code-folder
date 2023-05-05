const player1 = document.querySelector(".player1");
const image1 = document.querySelector(".img1");
const image2 = document.querySelector(".img2");
const result = document.querySelector(".result");
let count = 0;
let score1 = 0;
let score2 = 0;
// document.addEventListener("keydown", (x) => {
//   console.log(x);
//   if (x.key == "Enter") {
//     count = count + 1;
//     const num1 = Math.trunc(Math.random() * 6) + 1;
//     console.log(num1);
//     score1 += num1;
//     image1.src = `dice-${num1}.png`;
//     const num2 = Math.trunc(Math.random() * 6) + 1;
//     image2.src = `dice-${num2}.png`;
//     console.log(num2);
//     score2 += num2;
//     console.log(count);
//   }
// });
const button = function () {
  const num1 = Math.trunc(Math.random() * 6) + 1;
  console.log(num1);
  score1 += num1;
  image1.src = `dice-${num1}.png`;
  const num2 = Math.trunc(Math.random() * 6) + 1;
  image2.src = `dice-${num2}.png`;
  console.log(num2);
  score2 += num2;
  console.log(count);
};
document.addEventListener("keydown", (x) => {
  if (count <= 10) {
    if (x.key === "Enter") {
      count = count + 1;
      button();
    }
  } else if (count > 10) {
    if (score1 > score2) {
      document.querySelector(".resutl").textContent = "player 1 is winner";
    } else if (score2 > score1) {
      document.querySelector(".resutl").textContent = "player 2 is winner";
    }
  }
});
