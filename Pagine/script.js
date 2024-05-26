document.getElementById('contactForm').addEventListener('submit', function(event) {
    event.preventDefault();
    alert('Grazie per averci contattato, ' + document.getElementById('name').value + '!');
    document.getElementById('contactForm').reset();
});