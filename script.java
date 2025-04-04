 function addToCart(price) {
    cartTotal += price;
    document.getElementById("cart-total").textContent = cartTotal;
    alert("تمت الإضافة إلى السلة! المجموع الحالي: " + cartTotal + " دولار");
}