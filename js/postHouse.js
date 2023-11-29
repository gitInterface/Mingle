/**
 * 
 * $ = document.querySelector
 * $$ = document.querySelectorAll
 * 
 */
const $ = v => document.querySelector(v);
const $$ = v => document.querySelectorAll(v);
const prevBtn = $("#prev");
const nextBtn = $("#next");
const progress = $("#progress");
const nodeElements = $$(".node");
const sections = $$('.section');
const min = 0, max = nodeElements.length - 1;
let currentSectionIndex = 0; // section追蹤
let currentActive = 0; // 頁數追蹤

//頁面控制
nextBtn.addEventListener("click", () => {
    if (nextBtn.classList.contains('disabled')) return;
    if (currentActive >= max -1) {
        // currentActive = min;
        handleClass(nextBtn).addClass("disabled").removeClass("active");
    }
    if (currentActive <= max - 1) {
        sections[currentSectionIndex].classList.remove('active')
        // 找到下一個section
        currentSectionIndex++;
        sections[currentSectionIndex].classList.add('active')
        currentActive++;
    }
    if (currentActive > 0) {
        handleClass(prevBtn).addClass("active").removeClass("disabled");
    }
    update();
});

prevBtn.addEventListener("click", () => {
    if (prevBtn.classList.contains('disabled')) return;
    if (currentActive <= 1) {
        // currentActive = max -  1;
        handleClass(prevBtn).addClass("disabled").removeClass("active");
    }
    if (currentActive > 0) {
        sections[currentSectionIndex].classList.remove('active');
        currentSectionIndex--;
        sections[currentSectionIndex].classList.add('active');
        currentActive--;
    }
    if (currentActive <= max - 1) {
        handleClass(nextBtn).addClass("active").removeClass("disabled");
    }
    update();
});

//兩種classList寫法
function handleClass(el) {
    let methods = {
        addClass,
        removeClass
    };
    function addClass(c) {
        el.classList.add(c);
        return methods;
    };
    function removeClass(c) {
        el.classList.remove(c);
        return methods;
    }
    return methods
}

function update() {
    nodeElements.forEach((item, index) => {
        if (index <= currentActive) {
            // classLIst屬性返回元素的類名，作為DOMTokenList對象
            item.classList.add('active');
        } else {
            item.classList.remove('active');
        }
    });
    //toFixed() 四捨五入到指定小數位
    progress.style.width = (100 / max * currentActive).toFixed(2) + '%';
}


//btn選取

document.addEventListener("DOMContentLoaded", function() {
    // 拿到所有按鈕
    var buttons = document.querySelectorAll('.btn-row button');

    // 加點擊事件到所有按鈕
    buttons.forEach(function(button) {
        button.addEventListener('click', function() {
            // 把所有按鈕active屬性刪掉
            buttons.forEach(function(btn) {
                btn.classList.remove('active');
            });

            // 加active到選擇的按鈕
            button.classList.add('active');
        });
    });
});