exports.handler = async (event) => {
  console.log('Hello, Lambda function executed!', event);
  return {
    statusCode: 200,
    body: JSON.stringify('Hello from Lambda!'),
  };
};
