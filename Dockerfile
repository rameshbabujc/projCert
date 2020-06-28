# Ramesh Babu's Edureka DevOps Project
# 27th June 2020

# Pull Base Image
FROM devopsedu/webapp

# Add project

ADD website /var/www/html

# Remove existing index.html
RUN rm /var/www/html/index.html

# Run Apache
CMD apachectl -D FOREGROUND

EXPOSE 5000
