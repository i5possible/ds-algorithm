echo "gem update --system...."
gem update --system
echo "bundle install --path vendor/bundle"
bundle install --path vendor/bundle
echo "bundle exec jekyll serve"
bundle exec jekyll serve
echo "started successfully!"
