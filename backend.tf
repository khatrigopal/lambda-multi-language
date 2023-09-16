### Backend ###
# S3
###############

terraform {
  backend "s3" {
    bucket = "khatrig-githubaction"
    key = "lambda-multi-language.tfstate"
    region = "us-east-1"
  }
}
