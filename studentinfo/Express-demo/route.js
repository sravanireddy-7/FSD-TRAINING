const express = require('express');
const app = express();

app.get('/student/:id', (req, res) => {
    res.send(`Student ID: ${req.params.id}`);
});

app.listen(2000, () => {
    console.log('Server is ready');
});