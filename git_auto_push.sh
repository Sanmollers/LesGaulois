# - * - ENCODAGE: UTF-8 - * -
#! /bin/sh

read -p "Entrez le message du commit entre \"\" puis la touche Entrer ou la touche Entrer pour l'envoyer en urgence. " commit_message
echo -e "\n"

if [ $commit_message = ""]
then
 git add . | git commit -m "push en urgence � relire !" | git push
 echo "Push en urgence � relire !"
else
 git add . | git commit -m "$commit_message" | git push
 echo "Votre projet a bien �t� \"push\" avec le commit suivant : \""$commit_message"\" !"
fi
