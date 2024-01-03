
// 最後編輯日 (再調整)
let modifies = document.querySelectorAll(".modify");
let current = new Date();
modifies.forEach(modify => {
    modify.textContent = current.getFullYear() + '-' + (current.getMonth() + 1) + '-' + current.getDate()
        + ' ' + current.getHours() + ':' + current.getMinutes() + ':' + current.getSeconds();
})

//  狀態 ("上架中"→綠色；其他紅色)
let elements = document.querySelectorAll(".status");
elements.forEach(element => {
    if (element.textContent.trim() === "上架中") {
        element.style.color = "green";
    } else {
        element.style.color = "red";
    }
});
/*getElementsByClassName型別為HTMLCollectionOf<Element>
querySelectorAll則是NodeListOf<Element>
*/
