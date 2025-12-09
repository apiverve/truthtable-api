# Truth Table Generator API

Truth Table Generator creates complete truth tables for boolean expressions with support for AND, OR, NOT, XOR, NAND, and NOR operators.

![Build Status](https://img.shields.io/badge/build-passing-green)
![Code Climate](https://img.shields.io/badge/maintainability-B-purple)
![Prod Ready](https://img.shields.io/badge/production-ready-blue)

This is a Javascript Wrapper for the [Truth Table Generator API](https://apiverve.com/marketplace/truthtable)

---

## Installation

Using npm:
```shell
npm install @apiverve/truthtable
```

Using yarn:
```shell
yarn add @apiverve/truthtable
```

---

## Configuration

Before using the Truth Table Generator API client, you have to setup your account and obtain your API Key.
You can get it by signing up at [https://apiverve.com](https://apiverve.com)

---

## Quick Start

[Get started with the Quick Start Guide](https://docs.apiverve.com/quickstart)

The Truth Table Generator API documentation is found here: [https://docs.apiverve.com/ref/truthtable](https://docs.apiverve.com/ref/truthtable).
You can find parameters, example responses, and status codes documented here.

### Setup

```javascript
const truthtableAPI = require('@apiverve/truthtable');
const api = new truthtableAPI({
    api_key: '[YOUR_API_KEY]'
});
```

---

## Usage

---

### Perform Request

Using the API is simple. All you have to do is make a request. The API will return a response with the data you requested.

```javascript
var query = {
  expression: "A AND B OR C"
};

api.execute(query, function (error, data) {
    if (error) {
        return console.error(error);
    } else {
        console.log(data);
    }
});
```

---

### Using Promises

You can also use promises to make requests. The API returns a promise that you can use to handle the response.

```javascript
var query = {
  expression: "A AND B OR C"
};

api.execute(query)
    .then(data => {
        console.log(data);
    })
    .catch(error => {
        console.error(error);
    });
```

---

### Using Async/Await

You can also use async/await to make requests. The API returns a promise that you can use to handle the response.

```javascript
async function makeRequest() {
    var query = {
  expression: "A AND B OR C"
};

    try {
        const data = await api.execute(query);
        console.log(data);
    } catch (error) {
        console.error(error);
    }
}
```

---

## Example Response

```json
{
  "status": "ok",
  "error": null,
  "data": {
    "expression": "A AND B OR C",
    "normalized": "A && B || C",
    "variables": [
      "A",
      "B",
      "C",
      "D",
      "N",
      "O",
      "R"
    ],
    "variableCount": 7,
    "rowCount": 128,
    "rows": [
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 1
      }
    ],
    "asciiTable": "| A        | B        | C        | D        | N        | O        | R        | Result   |\n|----------|----------|----------|----------|----------|----------|----------|----------|\n| 0        | 0        | 0        | 0        | 0        | 0        | 0        | 0        |\n| 0        | 0        | 0        | 0        | 0        | 0        | 1        | 0        |\n| 0        | 0        | 0        | 0        | 0        | 1        | 0        | 0        |\n| 0        | 0        | 0        | 0        | 0        | 1        | 1        | 0        |\n| 0        | 0        | 0        | 0        | 1        | 0        | 0        | 0        |\n| 0        | 0        | 0        | 0        | 1        | 0        | 1        | 0        |\n| 0        | 0        | 0        | 0        | 1        | 1        | 0        | 0        |\n| 0        | 0        | 0        | 0        | 1        | 1        | 1        | 0        |\n| 0        | 0        | 0        | 1        | 0        | 0        | 0        | 0        |\n| 0        | 0        | 0        | 1        | 0        | 0        | 1        | 0        |\n| 0        | 0        | 0        | 1        | 0        | 1        | 0        | 0        |\n| 0        | 0        | 0        | 1        | 0        | 1        | 1        | 0        |\n| 0        | 0        | 0        | 1        | 1        | 0        | 0        | 0        |\n| 0        | 0        | 0        | 1        | 1        | 0        | 1        | 0        |\n| 0        | 0        | 0        | 1        | 1        | 1        | 0        | 0        |\n| 0        | 0        | 0        | 1        | 1        | 1        | 1        | 0        |\n| 0        | 0        | 1        | 0        | 0        | 0        | 0        | 1        |\n| 0        | 0        | 1        | 0        | 0        | 0        | 1        | 1        |\n| 0        | 0        | 1        | 0        | 0        | 1        | 0        | 1        |\n| 0        | 0        | 1        | 0        | 0        | 1        | 1        | 1        |\n| 0        | 0        | 1        | 0        | 1        | 0        | 0        | 1        |\n| 0        | 0        | 1        | 0        | 1        | 0        | 1        | 1        |\n| 0        | 0        | 1        | 0        | 1        | 1        | 0        | 1        |\n| 0        | 0        | 1        | 0        | 1        | 1        | 1        | 1        |\n| 0        | 0        | 1        | 1        | 0        | 0        | 0        | 1        |\n| 0        | 0        | 1        | 1        | 0        | 0        | 1        | 1        |\n| 0        | 0        | 1        | 1        | 0        | 1        | 0        | 1        |\n| 0        | 0        | 1        | 1        | 0        | 1        | 1        | 1        |\n| 0        | 0        | 1        | 1        | 1        | 0        | 0        | 1        |\n| 0        | 0        | 1        | 1        | 1        | 0        | 1        | 1        |\n| 0        | 0        | 1        | 1        | 1        | 1        | 0        | 1        |\n| 0        | 0        | 1        | 1        | 1        | 1        | 1        | 1        |\n| 0        | 1        | 0        | 0        | 0        | 0        | 0        | 0        |\n| 0        | 1        | 0        | 0        | 0        | 0        | 1        | 0        |\n| 0        | 1        | 0        | 0        | 0        | 1        | 0        | 0        |\n| 0        | 1        | 0        | 0        | 0        | 1        | 1        | 0        |\n| 0        | 1        | 0        | 0        | 1        | 0        | 0        | 0        |\n| 0        | 1        | 0        | 0        | 1        | 0        | 1        | 0        |\n| 0        | 1        | 0        | 0        | 1        | 1        | 0        | 0        |\n| 0        | 1        | 0        | 0        | 1        | 1        | 1        | 0        |\n| 0        | 1        | 0        | 1        | 0        | 0        | 0        | 0        |\n| 0        | 1        | 0        | 1        | 0        | 0        | 1        | 0        |\n| 0        | 1        | 0        | 1        | 0        | 1        | 0        | 0        |\n| 0        | 1        | 0        | 1        | 0        | 1        | 1        | 0        |\n| 0        | 1        | 0        | 1        | 1        | 0        | 0        | 0        |\n| 0        | 1        | 0        | 1        | 1        | 0        | 1        | 0        |\n| 0        | 1        | 0        | 1        | 1        | 1        | 0        | 0        |\n| 0        | 1        | 0        | 1        | 1        | 1        | 1        | 0        |\n| 0        | 1        | 1        | 0        | 0        | 0        | 0        | 1        |\n| 0        | 1        | 1        | 0        | 0        | 0        | 1        | 1        |\n| 0        | 1        | 1        | 0        | 0        | 1        | 0        | 1        |\n| 0        | 1        | 1        | 0        | 0        | 1        | 1        | 1        |\n| 0        | 1        | 1        | 0        | 1        | 0        | 0        | 1        |\n| 0        | 1        | 1        | 0        | 1        | 0        | 1        | 1        |\n| 0        | 1        | 1        | 0        | 1        | 1        | 0        | 1        |\n| 0        | 1        | 1        | 0        | 1        | 1        | 1        | 1        |\n| 0        | 1        | 1        | 1        | 0        | 0        | 0        | 1        |\n| 0        | 1        | 1        | 1        | 0        | 0        | 1        | 1        |\n| 0        | 1        | 1        | 1        | 0        | 1        | 0        | 1        |\n| 0        | 1        | 1        | 1        | 0        | 1        | 1        | 1        |\n| 0        | 1        | 1        | 1        | 1        | 0        | 0        | 1        |\n| 0        | 1        | 1        | 1        | 1        | 0        | 1        | 1        |\n| 0        | 1        | 1        | 1        | 1        | 1        | 0        | 1        |\n| 0        | 1        | 1        | 1        | 1        | 1        | 1        | 1        |\n| 1        | 0        | 0        | 0        | 0        | 0        | 0        | 0        |\n| 1        | 0        | 0        | 0        | 0        | 0        | 1        | 0        |\n| 1        | 0        | 0        | 0        | 0        | 1        | 0        | 0        |\n| 1        | 0        | 0        | 0        | 0        | 1        | 1        | 0        |\n| 1        | 0        | 0        | 0        | 1        | 0        | 0        | 0        |\n| 1        | 0        | 0        | 0        | 1        | 0        | 1        | 0        |\n| 1        | 0        | 0        | 0        | 1        | 1        | 0        | 0        |\n| 1        | 0        | 0        | 0        | 1        | 1        | 1        | 0        |\n| 1        | 0        | 0        | 1        | 0        | 0        | 0        | 0        |\n| 1        | 0        | 0        | 1        | 0        | 0        | 1        | 0        |\n| 1        | 0        | 0        | 1        | 0        | 1        | 0        | 0        |\n| 1        | 0        | 0        | 1        | 0        | 1        | 1        | 0        |\n| 1        | 0        | 0        | 1        | 1        | 0        | 0        | 0        |\n| 1        | 0        | 0        | 1        | 1        | 0        | 1        | 0        |\n| 1        | 0        | 0        | 1        | 1        | 1        | 0        | 0        |\n| 1        | 0        | 0        | 1        | 1        | 1        | 1        | 0        |\n| 1        | 0        | 1        | 0        | 0        | 0        | 0        | 1        |\n| 1        | 0        | 1        | 0        | 0        | 0        | 1        | 1        |\n| 1        | 0        | 1        | 0        | 0        | 1        | 0        | 1        |\n| 1        | 0        | 1        | 0        | 0        | 1        | 1        | 1        |\n| 1        | 0        | 1        | 0        | 1        | 0        | 0        | 1        |\n| 1        | 0        | 1        | 0        | 1        | 0        | 1        | 1        |\n| 1        | 0        | 1        | 0        | 1        | 1        | 0        | 1        |\n| 1        | 0        | 1        | 0        | 1        | 1        | 1        | 1        |\n| 1        | 0        | 1        | 1        | 0        | 0        | 0        | 1        |\n| 1        | 0        | 1        | 1        | 0        | 0        | 1        | 1        |\n| 1        | 0        | 1        | 1        | 0        | 1        | 0        | 1        |\n| 1        | 0        | 1        | 1        | 0        | 1        | 1        | 1        |\n| 1        | 0        | 1        | 1        | 1        | 0        | 0        | 1        |\n| 1        | 0        | 1        | 1        | 1        | 0        | 1        | 1        |\n| 1        | 0        | 1        | 1        | 1        | 1        | 0        | 1        |\n| 1        | 0        | 1        | 1        | 1        | 1        | 1        | 1        |\n| 1        | 1        | 0        | 0        | 0        | 0        | 0        | 1        |\n| 1        | 1        | 0        | 0        | 0        | 0        | 1        | 1        |\n| 1        | 1        | 0        | 0        | 0        | 1        | 0        | 1        |\n| 1        | 1        | 0        | 0        | 0        | 1        | 1        | 1        |\n| 1        | 1        | 0        | 0        | 1        | 0        | 0        | 1        |\n| 1        | 1        | 0        | 0        | 1        | 0        | 1        | 1        |\n| 1        | 1        | 0        | 0        | 1        | 1        | 0        | 1        |\n| 1        | 1        | 0        | 0        | 1        | 1        | 1        | 1        |\n| 1        | 1        | 0        | 1        | 0        | 0        | 0        | 1        |\n| 1        | 1        | 0        | 1        | 0        | 0        | 1        | 1        |\n| 1        | 1        | 0        | 1        | 0        | 1        | 0        | 1        |\n| 1        | 1        | 0        | 1        | 0        | 1        | 1        | 1        |\n| 1        | 1        | 0        | 1        | 1        | 0        | 0        | 1        |\n| 1        | 1        | 0        | 1        | 1        | 0        | 1        | 1        |\n| 1        | 1        | 0        | 1        | 1        | 1        | 0        | 1        |\n| 1        | 1        | 0        | 1        | 1        | 1        | 1        | 1        |\n| 1        | 1        | 1        | 0        | 0        | 0        | 0        | 1        |\n| 1        | 1        | 1        | 0        | 0        | 0        | 1        | 1        |\n| 1        | 1        | 1        | 0        | 0        | 1        | 0        | 1        |\n| 1        | 1        | 1        | 0        | 0        | 1        | 1        | 1        |\n| 1        | 1        | 1        | 0        | 1        | 0        | 0        | 1        |\n| 1        | 1        | 1        | 0        | 1        | 0        | 1        | 1        |\n| 1        | 1        | 1        | 0        | 1        | 1        | 0        | 1        |\n| 1        | 1        | 1        | 0        | 1        | 1        | 1        | 1        |\n| 1        | 1        | 1        | 1        | 0        | 0        | 0        | 1        |\n| 1        | 1        | 1        | 1        | 0        | 0        | 1        | 1        |\n| 1        | 1        | 1        | 1        | 0        | 1        | 0        | 1        |\n| 1        | 1        | 1        | 1        | 0        | 1        | 1        | 1        |\n| 1        | 1        | 1        | 1        | 1        | 0        | 0        | 1        |\n| 1        | 1        | 1        | 1        | 1        | 0        | 1        | 1        |\n| 1        | 1        | 1        | 1        | 1        | 1        | 0        | 1        |\n| 1        | 1        | 1        | 1        | 1        | 1        | 1        | 1        |\n"
  }
}
```

---

## Customer Support

Need any assistance? [Get in touch with Customer Support](https://apiverve.com/contact).

---

## Updates

Stay up to date by following [@apiverveHQ](https://twitter.com/apiverveHQ) on Twitter.

---

## Legal

All usage of the APIVerve website, API, and services is subject to the [APIVerve Terms of Service](https://apiverve.com/terms) and all legal documents and agreements.

---

## License
Licensed under the The MIT License (MIT)

Copyright (&copy;) 2025 APIVerve, and EvlarSoft LLC

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
