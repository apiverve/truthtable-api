# Truth Table Generator API - Ruby Gem

Truth Table Generator creates complete truth tables for boolean expressions with support for AND, OR, NOT, XOR, NAND, and NOR operators.

## Installation

Add this line to your application's Gemfile:

```ruby
gem 'apiverve_truthtable'
```

And then execute:

```bash
$ bundle install
```

Or install it yourself as:

```bash
$ gem install apiverve_truthtable
```

## Getting Started

Get your API key at [APIVerve](https://apiverve.com)

### Basic Usage

```ruby
require 'apiverve_truthtable'

# Initialize the client
client = APIVerve::Truthtable::Client.new(api_key: "YOUR_API_KEY")

# Make a request
response = client.execute({ expression: "A AND B OR C" })

# Print the response
puts response
```


### Error Handling

```ruby
begin
  response = client.execute({ expression: "A AND B OR C" })
  puts response["data"]
rescue APIVerve::Truthtable::ValidationError => e
  puts "Validation error: #{e.errors.join(', ')}"
rescue APIVerve::Truthtable::APIError => e
  puts "API error: #{e.message}"
  puts "Status code: #{e.status_code}"
end
```

### Debug Mode

```ruby
# Enable debug logging
client = APIVerve::Truthtable::Client.new(
  api_key: "YOUR_API_KEY",
  debug: true
)
```

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

## Documentation

For more information, visit the [API Documentation](https://docs.apiverve.com/ref/truthtable?utm_source=rubygems&utm_medium=referral&utm_content=readme).

## Support

- Website: [https://apiverve.com/marketplace/truthtable?utm_source=ruby&utm_medium=referral&utm_content=readme](https://apiverve.com/marketplace/truthtable?utm_source=ruby&utm_medium=referral&utm_content=readme)
- Email: hello@apiverve.com

## License

This gem is available under the [MIT License](LICENSE).
