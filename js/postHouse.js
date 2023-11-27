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
const min = 0, max = nodeElements.length - 1;
let currentActive = 0;

nextBtn.addEventListener("click", () => {
    if (nextBtn.classList.contains('disabled')) return;
    if (currentActive >= max - 1) {
        // currentActive = min;
        handleClass(nextBtn).addClass("disabled").removeClass("active");
    }
    if (currentActive <= max - 1) {
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
        currentActive--;
    }
    if (currentActive <= max - 1) {
        handleClass(nextBtn).addClass("active").removeClass("disabled");
    }
    update();
});

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
            // classLIst属性返回元素的类名，作为DOMTokenList对象
            item.classList.add('active');
        } else {
            item.classList.remove('active');
        }
    });
    //toFixed() 四捨五入到指定小數位
    progress.style.width = (100 / max * currentActive).toFixed(2) + '%';
}