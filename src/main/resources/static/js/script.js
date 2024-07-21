//sticky navbar
// executa functia la scroll
window.onscroll = function () {
  myFunction();
};
// navbarul
var navbar = document.getElementById("navbar");
// ia pozitia navbarului
var sticky = navbar.offsetTop;
// functia de sticky
function myFunction() {
  if (window.pageYOffset >= sticky) {
    navbar.classList.add("sticky");
  } else {
    navbar.classList.remove("sticky");
  }
}


