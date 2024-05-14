
document.addEventListener("DOMContentLoaded", function() {
    var successMessage = document.querySelector(".success-message");

    if (successMessage) {
        setTimeout(function() {
            successMessage.remove(); 
        }, 3000);
    }
});