//factory, defining its a JS file that you start with to declare the js script
//better way to start your JS
(function(root, factory) {
    if (typeof define === 'function' && define.amd) {
        define(['jquery'], factory);
    } else if (typeof module === 'object' && module.exports) {
        module.exports = factory(require('jquery'));
    } else {
        root.component = root.component || {};
        root.component.initialize = factory(root.jQuery);
    }
}(this, function($) {
    'use strict';

    function init() {
        //using jQuery in this function
        $(function(){
            //let defines within the specific scope (local)
            //var accessible in any scope
            let firstName;
            let lastName;
            let email;

            //object array (other single array)
            var flavorTable = [{name: "Mint Chocolate Chip", date: "09/01/2019", price: 1.99},
                                {name: "Strawberry", date: "09/02/2019", price: 2.99},
                                {name: "Moose Tracks", date: "09/03/2019", price: 1.99}]

            $('#submit').click(function(e) {
                //e.preventDefault(); stops the navigation on the console.log
                e.preventDefault();
                console.log('clicked submit');
                getEmail();

            });

            $('.flavorPriceButton').click(function(e) {
                e.preventDefault();
                console.log(e);
                if(e.target.id==="updateMintPrice"){
                    updateFlavorPrices("Mint Chocolate Chip", 2.99, "mintPrice");
                }
                    else if(e.target.id==="updateStrawberryPrice"){
                        updateFlavorPrices("Strawberry", 4.99, "strawberryPrice");
                }
                    else if(e.target.id==="updateMoosePrice"){
                        updateFlavorPrices("Moose Tracks", 2.99, "moosePrice");
                }
            });

            //inside a function you should use a let rather than var
            function getEmail() {
                firstName = document.getElementById("fname").value;
                console.log(firstName)
            }
            function showUserInput() {
                //show input box
                //show update and cancel button (2 buttons which are hidden, and revealed when clicked
            }

            function returnToDefaultView(){
                //hide inputs
                //hide action buttons
                //return to update price button
            }

            //must list what you're changing in the () because you have to pass them in
            function updateFlavorPrices(type, price, priceID) {
                flavorTable.forEach(item =>{
                    //if the item.name matches the type put in, then we'll change the price to what is listed
                    if(item.name === type){
                        item.price = price;
                        $('#' + priceID).html(price);
                    }
                });
                //print out in the console.log
                console.log(flavorTable);
            }
        });

        }
        return {
            init: init,
        };
}));




//var first, actions second, functions third
//alert, prompt, debugger, console.log