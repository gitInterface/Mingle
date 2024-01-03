// This js file is for initializing pages with following items:
// 1. spinner & navbar
// 2. footer & back to top button
//***************************************************************************************
// How to use: 
// 1. import this js file in your html file by following code
//    <script src="/js/initPage.js" type="text/javascript"></script>
// 2. remember to add the following code to your html file
//    <div id="container" class="container-fluid bg-white p-0">/* your content */</div>
//***************************************************************************************
// Note: 
// Please turn down "Format on Save" option in VSCode to avoid format error of html comments.



// initialize spinner & navbar

let nav = `
<!-- Spinner Start -->
<div id="spinner"
    class="show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center">
    <div class="spinner-border text-primary" style="width: 3rem; height: 3rem;" role="status">
        <span class="sr-only">Loading...</span>
    </div>
</div>
<!-- Spinner End -->

<!-- Navbar Start -->
<div class="container-fluid nav-bar">
    <nav class="navbar bg-primary navbar-expand-lg navbar-light py-0 px-4">
        <a href="index.html" class="navbar-brand d-flex align-items-center text-center">
            <div class="icon p-2 me-2">
                <img class="img-fluid" src="img/icon-main.png" alt="Icon" style="width: 30px; height: 27px;">
            </div>
            <h1 class="m-0 link-secondary">Mingle 名狗</h1>
        </a>
        <button type="button" class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <div class="navbar-nav ms-auto">
                <a href="index.html" class="nav-item nav-link active">首頁</a>
                <a href="info.html" class="nav-item nav-link">關於Mingle</a>
                <div class="nav-item dropdown">
                    <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">打工換宿資訊</a>
                    <div class="dropdown-menu rounded-0 m-0">
                        <a href="404.html" class="dropdown-item">瀏覽打工項目</a>
                        <a href="404.html" class="dropdown-item">住宿地點一覽</a>
                    </div>
                </div>
                <div class="nav-item dropdown">
                    <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">論壇日誌</a>
                    <div class="dropdown-menu rounded-0 m-0">
                        <a href="forum.html" class="dropdown-item">討論 & 問答</a>
                        <a href="404.html" class="dropdown-item">打工日誌</a>
                    </div>
                </div>
                <a href="404.html" class="nav-item nav-link">聯絡我們</a>
                <a href="provider_form.html" class="nav-item nav-link">成為提供者</a>
            </div>
            <a href="order.html" class="btn btn-secondary px-3 d-lg-flex" style="margin-right: 30px;">成為幫助者</a>
            <a href="login.html" class="btn btn-dark px-3 d-lg-flex">登入</a>
        </div>
    </nav>
</div>
<!-- Navbar End -->
`
document.getElementById("container").insertAdjacentHTML('afterbegin', nav);



// initialize footer & back to top button
let foot = `
<!-- Footer Start -->
<div class="container-fluid bg-dark text-white-50 footer pt-5 mt-5">
    <div class="container py-5">
        <div class="row g-5">
            <div class="col-lg-3 col-md-6">
                <h5 class="text-white mb-4">平台資訊</h5>
                <p class="mb-2"><i class="fa fa-map-marker-alt me-3"></i>台北市大安區復興南路一段390號2樓</p>
                <p class="mb-2"><i class="fa fa-phone-alt me-3"></i>02 6631 6588</p>
                <p class="mb-2"><i class="fa fa-envelope me-3"></i>Mingle.org@gmail.com</p>
                <div class="d-flex pt-2">
                    <a class="btn btn-outline-light btn-social" href=""><i class="fab fa-twitter"></i></a>
                    <a class="btn btn-outline-light btn-social" href=""><i class="fab fa-facebook-f"></i></a>
                    <a class="btn btn-outline-light btn-social" href=""><i class="fab fa-youtube"></i></a>
                    <a class="btn btn-outline-light btn-social" href=""><i class="fab fa-linkedin-in"></i></a>
                </div>
            </div>
            <div class="col-lg-3 col-md-6">
                <h5 class="text-white mb-4">用戶規範</h5>
                <a class="btn btn-link text-white-50" href="">服務條款</a>
                <a class="btn btn-link text-white-50" href="">隱私政策</a>
                <a class="btn btn-link text-white-50" href="">使用者合約</a>
            </div>
            <div class="col-lg-3 col-md-6">
                <h5 class="text-white mb-4">活動相簿</h5>
                <div class="row g-2 pt-2">
                    <div class="col-4">
                        <img class="img-fluid rounded bg-light p-1" src="img/property-1.jpg" alt="">
                    </div>
                    <div class="col-4">
                        <img class="img-fluid rounded bg-light p-1" src="img/property-2.jpg" alt="">
                    </div>
                    <div class="col-4">
                        <img class="img-fluid rounded bg-light p-1" src="img/property-3.jpg" alt="">
                    </div>
                    <div class="col-4">
                        <img class="img-fluid rounded bg-light p-1" src="img/property-4.jpg" alt="">
                    </div>
                    <div class="col-4">
                        <img class="img-fluid rounded bg-light p-1" src="img/property-5.jpg" alt="">
                    </div>
                    <div class="col-4">
                        <img class="img-fluid rounded bg-light p-1" src="img/property-6.jpg" alt="">
                    </div>
                </div>
            </div>
            <div class="col-lg-3 col-md-6">
                <h5 class="text-white mb-4">訂閱電子報</h5>
                <p>成為Mingle的訂閱戶，<br>即時接收最新的消息！</p>
                <div class="position-relative mx-auto" style="max-width: 400px;">
                    <input class="form-control bg-transparent w-100 py-3 ps-4 pe-5" type="text"
                        placeholder="請填入email">
                    <button type="button"
                        class="btn btn-primary py-2 position-absolute top-0 end-0 mt-2 me-2">送出</button>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="copyright">
            <div class="row">
                <div class="col-md-6 text-center text-md-start mb-3 mb-md-0">
                    &copy; <a class="border-bottom" href="#">Mingle</a>, All Right Reserved.
                    Designed By <a class="border-bottom" href="https://www.ispan.com.tw/">Mingle
                        Co.,Ltd. 名狗團隊</a>
                </div>
                <div class="col-md-6 text-center text-md-end">
                    <div class="footer-menu">
                        <a href="">返回首頁</a>
                        <a href="">Cookies</a>
                        <a href="">聯絡我們</a>
                        <a href="">常見 Q&A</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Footer End -->

<!-- Back to Top -->
    <a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i class="bi bi-arrow-up"></i></a>
`
document.getElementById("container").insertAdjacentHTML('beforeend', foot);

// let sharedFunctions = `
// <script src="js/sharedFunctions.js"></script>
// `
// document.getElementById("container").insertAdjacentHTML('afterend', sharedFunctions);

// old code, don't look, just in case we need it in the future
//
// let currentPage = window.location.pathname.split('/').pop();
// let links = document.querySelectorAll('#navbar a');
// for (let link of links) {
//     if (link.getAttribute('href') === currentPage) {
//         link.classList.add('current-page');
//         break;
//     }
// }