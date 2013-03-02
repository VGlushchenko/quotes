$(document).ready(function() {

    $('div.new-random-quote').click(function() {
        $.ajax({
            url: 'quotes/json',
            type: 'POST',
            dataType : "json",
            success: function (response) {

                $('p.quote').html(response.quote);
                $('div.quotes-author').text(response.author.name);
                $('div.quote-category').text(response.category);


                //alert(response.quote + ' - Author: ' + response.author.name)

            },
            error: function () {
                $('div.quote').text('Trubbles with server');
            }
        });
    });


});